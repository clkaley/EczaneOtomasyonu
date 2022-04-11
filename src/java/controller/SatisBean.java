/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import dao.SatisDAO;
import entity.Alis;
import entity.Satis;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Taha
 */

@Named(value = "satisBean")
@SessionScoped
public class SatisBean implements Serializable{
    private SatisDAO dao;
    private Satis entity;
    
    
    public String create() {
        this.entity.setCreated(new Timestamp(System.currentTimeMillis()));
        this.getDao().create(entity);
        this.entity = new Satis();
        return "/satis/list";
    }
    
    public List<Satis> getRead() {
        return this.getDao().read();
    }
    
    public String updateForm(Satis i) {
        this.entity = i;
        return "/alis/update";
    }
    
    public String update() {
        this.getDao().update(entity);
        this.entity=new Satis();
        return "/alis/list";
    }
    
    public void delete(Satis i) {
        this.getDao().delete(i);
    }

    public SatisBean() {
    }
    

    public SatisDAO getDao() {
        if (this.dao == null) {
            this.dao = new SatisDAO();
        }
        return dao;
    }

    public void setDao(SatisDAO dao) {
        this.dao = dao;
    }

    public Satis getEntity() {
        if (this.entity == null) {
            this.entity = new Satis();
        }
        return entity;
    }

    public void setEntity(Satis entity) {
        this.entity = entity;
    }
    
    
}
