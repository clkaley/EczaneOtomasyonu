
package controller;

import dao.OdemeDAO;
import entity.Ilac;
import entity.Odeme;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


@Named(value = "odemeBean")
@SessionScoped
public class OdemeBean implements Serializable {

    private OdemeDAO dao;
    private Odeme entity;
    
        private int page = 1;
    private int pageCount = 0;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        List<Odeme> hastaList = this.getDao().read();
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
    public String create() {
        this.entity.setCreated(new Timestamp(System.currentTimeMillis()));
        this.getDao().create(entity);
        this.entity = new Odeme();
        return "/odeme/list";
    }

    public List<Odeme> getRead() {
        return this.getDao().read(page);
    }

    public String updateForm(Odeme i) {
        this.entity = i;
        return "/odeme/update";
    }

    public String update() {
        this.getDao().update(entity);
        this.entity = new Odeme();
        return "/odeme/list";
    }

    public void delete(Odeme i) {
        this.getDao().delete(i);
    }

    /**
     * Creates a new instance of OdemeBean
     */
    public OdemeBean() {
    }

    public OdemeDAO getDao() {
        if (this.dao == null) {
            this.dao = new OdemeDAO();
        }
        return dao;
    }

    public void setDao(OdemeDAO dao) {
        this.dao = dao;
    }

    public Odeme getEntity() {
        if (this.entity == null) {
            this.entity = new Odeme();
        }
        return entity;
    }

    public void setEntity(Odeme entity) {
        this.entity = entity;
    }

}
