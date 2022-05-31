/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.HastaDAO;
import entity.Hasta;
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
@Named(value = "hastaBean")
@SessionScoped
public class HastaBean implements Serializable {

    private HastaDAO dao;
    private Hasta entity;
    
    private int page = 1;
    private int pageCount = 0;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        List<Hasta> hastaList = this.getDao().read();
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
        this.entity = new Hasta();
        return "/hasta/list";
    }

    public List<Hasta> getRead() {
        return this.getDao().read(page);
    }

    public String updateForm(Hasta i) {
        this.entity = i;
        return "/hasta/update";
    }

    public String update() {
        this.getDao().update(entity);
        this.entity=new Hasta();
        return "/hasta/list";
    }

    public void delete(Hasta i) {
        this.getDao().delete(i);
    }

    /**
     * Creates a new instance of HastaBean
     */
    public HastaBean() {
    }

    public HastaDAO getDao() {
        if (this.dao == null) {
            this.dao = new HastaDAO();
        }
        return dao;
    }

    public void setDao(HastaDAO dao) {
        this.dao = dao;
    }

    public Hasta getEntity() {
        if (this.entity == null) {
            this.entity = new Hasta();
        }
        return entity;
    }

    public void setEntity(Hasta entity) {
        this.entity = entity;
    }
    
      public boolean validateTcno(FacesContext context, UIComponent cmp, Object value) throws ValidatorException{
        String v = (String) value;
        
        if(v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("TCNO alanı boş bırakılamaz !"));
        }else if (v.length() < 11){
             throw new ValidatorException(new FacesMessage("TCNO alanı en az 11 karakter olmalıdır !"));
        }
        
        return true;
    }

}
