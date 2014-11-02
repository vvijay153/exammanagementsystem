/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@RequestScoped
@Named
public class Lecturer extends User{

    @OneToMany
    private List<Modules> selectedModules;
    private int firstLogin;

   /* public List<String> getSelectedModules() {
        
        List <String> modulesList = new ArrayList<>();
        modulesList.add(("oodp"));
        modulesList.add(("Jave"));
        modulesList.add(("EI"));
        return modulesList;
    }

    */

    public int getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(int firstLogin) {
        this.firstLogin = firstLogin;
    }
    

    /*public List<Modules> getModulesList() {
        List <Modules> modulesList = new ArrayList<>();
        modulesList.add(new Modules("oodp"));
        modulesList.add(new Modules("Jave"));
        modulesList.add(new Modules("EI"));
        return modulesList;
    } */

    
    public List<Modules> getSelectedModules() {
        return selectedModules;
    }

    public void setSelectedModules(List<Modules> selectedModules) {
        this.selectedModules = selectedModules;
    }
   
    
    
}
