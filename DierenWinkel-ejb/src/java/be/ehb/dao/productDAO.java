/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.dao;

import be.ehb.entities.Product;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;


/**
 *
 * @author mobapp10
 */
@Stateless
public class productDAO {
    @PersistenceContext(unitName = "DierenWinkel-ejbPU")
    EntityManager em;
    
    public List<Product> getprodlijst() {
         TypedQuery<Product> query = em.createNamedQuery("Product.findAll", Product.class);
         List<Product> producten = query.getResultList();
         return producten;
    }
    
}

