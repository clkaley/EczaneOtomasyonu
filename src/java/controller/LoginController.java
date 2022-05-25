/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.UserManager;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.ValidatorException;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author Ramazan
 */
@Named(value = "lc")
@SessionScoped
public class LoginController implements Serializable {

    private UserManager user;

    public LoginController() {
    }

    public void login() {
        if(user.getUsername().equals("Admin") && user.getPassword().equals("1234")){
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("ValidUser", user);
        }
        else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Kullanıcı adı veya şifre hatalı"));
        }
    }
    
    public boolean validatePassword(FacesContext context, UIComponent cmp, Object value) throws ValidatorException{
        String v = (String) value;
        
        if(v.isEmpty()) {
            throw new ValidatorException(new FacesMessage("Şifre alanı boş bırakılamaz !"));
        }else if (v.length() < 4){
             throw new ValidatorException(new FacesMessage("Şifre alanı en az 4 karakter olmalıdır !"));
        }
        
        return true;
    }
     public boolean validateUsername(FacesContext context, UIComponent cmp, Object value) throws ValidatorException{
        String v = (String) value;
        
        if (v.length() < 4){
             throw new ValidatorException(new FacesMessage("Kullanıcı adı en az 4 karakter olmalıdır !"));
        }
        
        return true;
    }
    
    

    public UserManager getUser() {
        if (user == null) {
            user = new UserManager();
        }
        return user;
    }

    public void setUser(UserManager user) {
        this.user = user;
    }

}
