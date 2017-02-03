/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.dao;

import be.ehb.entities.Klant;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

/**
 *
 * @author mobapp10
 */
@Stateful
public class KlantDAO {
    
    @Resource
    Validator validator;
    
    @PersistenceContext(unitName = "DierenWinkel-ejbPU")
    private EntityManager em;
    
    private static final Logger LOG = Logger.getLogger(KlantDAO.class.getName());
    
    public boolean nieuweKlant(String voornaam, String familienaam, String email, String adres, String wachtwoord) {
        Klant klant = new Klant(email, voornaam, familienaam, adres, wachtwoord);
        em.persist(klant);
        
        
        Set<ConstraintViolation<Klant>> violations = validator.validate(klant);
        
        if(violations.isEmpty()) {
            em.persist(klant);
            em.flush();
            return true;
        }
        
        for (ConstraintViolation<Klant> violation : violations) {
            LOG.log(Level.WARNING, violation.getMessage());
        }
        return false;
    }
}
