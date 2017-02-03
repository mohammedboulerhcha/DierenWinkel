/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.beans;

import be.ehb.entities.Product;
import java.util.ArrayList;
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
public class WinkelkarBean {
    int id;
    String naam;
    float prijs;
    ArrayList<Product> inhoudKar = new ArrayList<>();
    
    
    public void voegToe(Product p) {
        inhoudKar.add(p);
    }
}
