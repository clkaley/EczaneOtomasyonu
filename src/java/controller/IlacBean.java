/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.IlacDAO;
import entity.Ilac;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
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
        return this.getDao().read();
    }
    public String updateForm(Ilac i) {
        this.entity = i;
        return "/ilac/update";
    }
    
    public String update() {
         this.getDao().update(entity);
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
    
    
}
