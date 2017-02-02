/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.beans;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author momo
 */

    @Named
    @SessionScoped
public class BeanValidationView implements Serializable{
              
        
    @Size(min=2,max=5)
        private String Voornaam;
    
    @Size(min=2,max=5)           
    private String Familienaam;
        
    private String Adres;
        
    @Pattern(regexp="^[-+]?\\d+$")
        private String Wachtwoord;
        
    @Pattern(regexp="^[-+]?\\d+$")
       private String Wachtwoord_verifiëren;
    public BeanValidationView() {
    }
      private String E_mail_adres;
   

    public String getVoornaam() {
        return Voornaam;
    }

    public void setVoornaam(String Voornaam) {
        this.Voornaam = Voornaam;
    }

    public String getFamilienaam() {
        return Familienaam;
    }

    public void setFamilienaam(String Familienaam) {
        this.Familienaam = Familienaam;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

    public String getWachtwoord() {
        return Wachtwoord;
    }

    public void setWachtwoord(String Wachtwoord) {
        this.Wachtwoord = Wachtwoord;
    }

    public String getWachtwoord_verifiëren() {
        return Wachtwoord_verifiëren;
    }

    public void setWachtwoord_verifiëren(String Wachtwoord_verifiëren) {
        this.Wachtwoord_verifiëren = Wachtwoord_verifiëren;
    }

    public String getE_mail_adres() {
        return E_mail_adres;
    }

    public void setE_mail_adres(String E_mail_adres) {
        this.E_mail_adres = E_mail_adres;
    }
               
       public class SelectBooleanView {
 
    private boolean value1;   
    private boolean value2;
 
    public boolean isValue1() {
        return value1;
    }
 
    public void setValue1(boolean value1) {
        this.value1 = value1;
    }
 
    public boolean isValue2() {
        return value2;
    }
 
    public void setValue2(boolean value2) {
        this.value2 = value2;
    }
     
    public void addMessage() {
        String summary = value2 ? "Checked" : "Unchecked";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }
}      
     
   
}

