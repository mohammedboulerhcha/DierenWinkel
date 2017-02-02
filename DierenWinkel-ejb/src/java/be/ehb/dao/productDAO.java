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

import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author mobapp10
 */
@Stateless
public class productDAO {

    @PersistenceContext(unitName = "DierenWinkel-ejbPU")
    EntityManager em;

    public List<Product> getProdLijst() {
        TypedQuery<Product> query = em.createNamedQuery("Product.findAll", Product.class);
        List<Product> producten = query.getResultList();
        return producten;
    }

    /**
     * ik heb deze link gebruikt http://docs.oracle.com/javaee/6/tutorial/doc/bnbrg.html
     * @return 
     */
    public List<Product> getVoeding() {
        Query query;
        query = em.createNamedQuery("Product.findByCategorie").setParameter("categorie", "voeding");
        List<Product> producten = query.getResultList();
        return producten;
    }
    
    public List<Product> getSpeelgoed() {
        Query query;
        query = em.createNamedQuery("Product.findByCategorie").setParameter("categorie", "speelgoed");
        List<Product> producten = query.getResultList();
        return producten;
    }
    
    public List<Product> getHabitat() {
        Query query;
        query = em.createNamedQuery("Product.findByCategorie").setParameter("categorie", "habitat");
        List<Product> producten = query.getResultList();
        return producten;
    }

}
