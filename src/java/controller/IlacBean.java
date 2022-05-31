/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.IlacDAO;
import entity.Ilac;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.ValidatorException;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author ruslu
 */
@Named(value = "ilacBean")
@SessionScoped
public class IlacBean implements Serializable {
    private IlacDAO dao;
    private Ilac entity;
    
    private int page = 1;
    private int pageCount = 0;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        List<Ilac> hastaList = this.getDao().read();
        int size = hastaList.size();
        pageCount = (int) Math.ceil(size / 5);
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    
    public void prev() {
        page--;
        if(page < 1) {
            page = this.getPageCount();
        }
    }
    
    public void next() {
        page++;
        if(page > this.getPageCount()) {
            page = 1;
        }
    }
   
    

    //CRUD
    
    public String create(){
        this.entity.setCreated(new Timestamp(System.currentTimeMillis()));
        this.getDao().create(entity);
        this.entity = new Ilac();
        return "/ilac/list";
    }
    public Ilac getById(int id){
        return this.getDao().getById(id);
    }
    public List<Ilac> getRead() {
        return this.getDao().read(page);
    }
    public String updateForm(Ilac i) {
        this.entity = i;
        return "/ilac/update";
    }
    
    public String update() {
         this.getDao().update(entity);
         this.entity = new Ilac();
        return "/ilac/list";
    }
    
    public void delete(Ilac i) {
        this.getDao().delete(i);
    }
    
    
    /**
     * Creates a new instance of IlacBean
     */
    public IlacBean() {
    }

    public IlacDAO getDao() {
        if(this.dao == null){
            this.dao = new IlacDAO();
        }
        return dao;
    }

    public void setDao(IlacDAO dao) {
        this.dao = dao;
    }

    public Ilac getEntity() {
        if(this.entity == null) {
            this.entity = new Ilac();
        }
        return entity;
    }

    public void setEntity(Ilac entity) {
        this.entity = entity;
    }
    
     public boolean validateName(FacesContext context, UIComponent cmp, Object value) throws ValidatorException{
        String v = (String) value;
        
        if(v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("Lütfen ilaç ismini giriniz !"));
        }else if (v.length() < 4){
             throw new ValidatorException(new FacesMessage("Name alanı en az 4 karakter olmalıdır !"));
        }
        
        return true;
    }
    
}
