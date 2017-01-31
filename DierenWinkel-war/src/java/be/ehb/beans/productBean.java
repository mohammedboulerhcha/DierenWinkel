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
    
    public List<Product> getprodlijst() {
        return proddao.getprodlijst();
    }
    
    public List<Product> getVoeding() {
        return proddao.getVoeding();
    }
    
}


