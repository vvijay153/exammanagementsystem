/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author gautamverma
 */

@RequestScoped
@Named
public class Menu implements Serializable{
 
    private String menuSelected="Login.xhtml";
    

    public String menuSelected() {
        return menuSelected;
    }

    public String getMenuSelected() {
        return menuSelected;
    }

    public void setMenuSelected(String menuSelected) {
        this.menuSelected = menuSelected;
    }
    
    
    
}
