/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.ehb.beans;

import javax.ejb.Stateful;

/**
 *
 * @author mobapp10
 */
@Stateful
public class WinkelkarBean {
    int id;
    String naam;
    float prijs;
    
    public void voegToe() {
        
    }
}
