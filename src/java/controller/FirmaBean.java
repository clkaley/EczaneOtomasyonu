
package controller;

import dao.FirmaDAO;
import entity.Firma;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.ValidatorException;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


@Named(value = "firmaBean")
@SessionScoped
public class FirmaBean implements Serializable {
    private FirmaDAO dao;
    private Firma entity;
    
  

    //CRUD işlemleri
    public String create(){
        this.entity.setCreated(new Timestamp(System.currentTimeMillis()));
        this.getDao().create(entity);
        this.entity = new Firma();
        return "/firma/list";
    }
    
    public List<Firma> getRead() {
        return this.getDao().read();
    }
    public String updateForm(Firma i) {
        this.entity = i;
        return "/firma/update";
    }
    
    public String update() {
         this.getDao().update(entity);
        return "/firma/list";
    }
    
    public void delete(Firma i) {
        this.getDao().delete(i);
    }
    
    
    /**
     * Creates a new instance of FirmaBean
     */
    public FirmaBean() {
    }

    public FirmaDAO getDao() {
        if(this.dao == null){
            this.dao = new FirmaDAO();
        }
        return dao;
    }

    public void setDao(FirmaDAO dao) {
        this.dao = dao;
    }

    public Firma getEntity() {
        if(this.entity == null) {
            this.entity = new Firma();
        }
        return entity;
    }

    public void setEntity(Firma entity) {
        this.entity = entity;
    }
    
     public boolean validateTelefon(FacesContext context, UIComponent cmp, Object value) throws ValidatorException {
        String v = (String) value;

        if (v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("Telefon alanı boş bırakılamaz !"));
        } else if (v.length() < 11) {
            throw new ValidatorException(new FacesMessage("Telefon alanı en az 11 karakter olmalıdır !"));
        }

        return true;
    }
    
}
