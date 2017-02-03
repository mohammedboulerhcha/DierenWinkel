/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.beans;

import be.ehb.entities.Product;
import java.io.Serializable;
import java.util.HashSet;
import java.util.TreeSet;

import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mobapp10
 */
@Named
@Stateful
@SessionScoped
public class WinkelmandBean implements Serializable{
    int id;
    String naam;
    float prijs;
    HashSet<Product> inhoudmand = new HashSet<>();
    
    
    public void voegToe(Product p) {
        inhoudmand.add(p);
    }
    
    public HashSet<Product> weergeven(Product p) {
        return inhoudmand;
    }
}
