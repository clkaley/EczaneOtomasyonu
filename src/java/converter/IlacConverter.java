/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.IlacDAO;
import entity.Ilac;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author ruslu
 */
@FacesConverter(value="ilacConverter")
public class IlacConverter implements Converter{
        
    private IlacDAO ilacDao;

    public IlacDAO getIlacDao() {
        if (this.ilacDao == null) {
            this.ilacDao = new IlacDAO();
        }
        return ilacDao;
    }

    public void setIlacDao(IlacDAO ilacDao) {
        this.ilacDao = ilacDao;
    }
    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
      return this.getIlacDao().getById(Integer.valueOf(string));
        
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
       Ilac i = (Ilac)t;
       return String.valueOf(i.getIlac_id());
    }
    
}
