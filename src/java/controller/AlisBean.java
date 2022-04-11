
package controller;

import dao.AlisDAO;
import entity.Alis;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Named(value = "alisBean")
@SessionScoped
public class AlisBean implements Serializable {
    private AlisDAO dao;
    private Alis entity;
    

    //CRUD işlemleri
    
    public String create(){
        this.entity.setCreated(new Timestamp(System.currentTimeMillis()));
        this.getDao().create(entity);
        this.entity = new Alis();
        return "/alis/list";
    }
    public Alis getById(int id){
        return this.getDao().getById(id);
    }
    public List<Alis> getRead() {
        return this.getDao().read();
    }
    public String updateForm(Alis i) {
        this.entity = i;
        return "/alis/update";
    }
    
    public String update() {
         this.getDao().update(entity);
        return "/alis/list";
    }
    
    public void delete(Alis i) {
        this.getDao().delete(i);
    }
    
    
    /**
     * Creates a new instance of AlisBean
     */
    public AlisBean() {
    }

    public AlisDAO getDao() {
        if(this.dao == null){
            this.dao = new AlisDAO();
        }
        return dao;
    }

    public void setDao(AlisDAO dao) {
        this.dao = dao;
    }

    public Alis getEntity() {
        if(this.entity == null) {
            this.entity = new Alis();
        }
        return entity;
    }

    public void setEntity(Alis entity) {
        this.entity = entity;
    }
    
    
}
