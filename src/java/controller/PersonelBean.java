package controller;

import dao.PersonelDAO;
import entity.Personel;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.ValidatorException;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Named(value = "personelBean")
@SessionScoped
public class PersonelBean implements Serializable {

    private PersonelDAO dao;
    private Personel entity;

    //CRUD işlemleri
    public String create() {
        this.entity.setCreated(new Timestamp(System.currentTimeMillis()));
        this.getDao().create(entity);
        this.entity = new Personel();
        return "/personel/list";
    }

    public Personel getById(int id) {
        return this.getDao().getById(id);
    }

    public List<Personel> getRead() {
        return this.getDao().read();
    }

    public String updateForm(Personel i) {
        this.entity = i;
        return "/personel/update";
    }

    public String update() {
        this.getDao().update(entity);
        return "/personel/list";
    }

    public void delete(Personel i) {
        this.getDao().delete(i);
    }

    /**
     * Creates a new instance of PersonelBean
     */
    public PersonelBean() {
    }

    public PersonelDAO getDao() {
        if (this.dao == null) {
            this.dao = new PersonelDAO();
        }
        return dao;
    }

    public void setDao(PersonelDAO dao) {
        this.dao = dao;
    }

    public Personel getEntity() {
        if (this.entity == null) {
            this.entity = new Personel();
        }
        return entity;
    }

    public void setEntity(Personel entity) {
        this.entity = entity;
    }

    public boolean validateTcno(FacesContext context, UIComponent cmp, Object value) throws ValidatorException {
        String v = (String) value;

        if (v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("TCNO alanı boş bırakılamaz !"));
        } else if (v.length() < 11) {
            throw new ValidatorException(new FacesMessage("TCNO alanı en az 11 karakter olmalıdır !"));
        }

        return true;
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
