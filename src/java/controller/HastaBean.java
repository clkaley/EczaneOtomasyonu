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

   

    //CRUD
    public String create() {
        this.entity.setCreated(new Timestamp(System.currentTimeMillis()));
        this.getDao().create(entity);
        this.entity = new Hasta();
        return "/hasta/list";
    }

    public List<Hasta> getRead() {
        return this.getDao().read();
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
