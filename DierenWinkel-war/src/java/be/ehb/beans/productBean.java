/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.beans;


import be.ehb.dao.productDAO;
import be.ehb.entities.Product;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mobapp10
 */
@Named
@SessionScoped
public class productBean implements Serializable{

    @EJB
    productDAO proddao;
    
    public productBean() {
    }
    
    public List<Product> getProdLijst() {
        return proddao.getProdLijst();
    }
    
    public List<Product> getVoeding() {
        return proddao.getVoeding();
    }
    
    public List<Product> getSpeelgoed() {
        return proddao.getSpeelgoed();
    }
    
    public List<Product> getHabitat() {
        return proddao.getHabitat();
    }
    
    public List<Product> getSpecifiekArtikel(String zoek) {
        return proddao.getSpecifiekArtikel(zoek);
    }
    
}


