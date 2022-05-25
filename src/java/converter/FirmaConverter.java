/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.FirmaDAO;
import entity.Firma;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author Ramazan
 */
@FacesConverter(value = "firmaConverter")
public class FirmaConverter implements Converter{
    
    private FirmaDAO firmaDao;

    public FirmaDAO getFirmaDao() {
        if ( this.firmaDao == null){
            this.firmaDao = new FirmaDAO();
        }
        return firmaDao;
    }

    public void setFirmaDao(FirmaDAO firmaDao) {
        this.firmaDao = firmaDao;
    }
    

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return this.getFirmaDao().getById(Integer.valueOf(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        Firma f = (Firma)t;
        return String.valueOf(f.getFirma_id());
    }
    
}
