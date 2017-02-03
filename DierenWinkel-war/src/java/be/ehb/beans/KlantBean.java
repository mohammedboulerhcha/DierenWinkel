/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.beans;

import be.ehb.dao.KlantDAO;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * met behulp van http://ruby.fgcu.edu/courses/mpenderg/ism3232Notes/LoginNotes.html
 * @author mobapp10
 */
@Named
@SessionScoped
public class KlantBean implements Serializable{
    private String naam;
    private String email;
    private String wachtwoord;
    private boolean isLoggedIn = false;
    
    @EJB
    KlantDAO klantDAO;
    
    public KlantBean() {
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
    
    public void nieuweKlant(String voornaam, String familienaam, String email, String adres, String wachtwoord) {
        klantDAO.nieuweKlant(voornaam, familienaam, email, adres, wachtwoord);
    }
    
    
    
}
