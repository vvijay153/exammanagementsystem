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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity
@RequestScoped
@Named
public class Lecturer {

    @TableGenerator(name = "LECTURER_GEN", table = "SEQUENCE_TABLE", pkColumnName = "SEQ_NAME",
            valueColumnName = "SEQ_COUNT", pkColumnValue = "LECTURER_SEQ", initialValue = 0, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "LECTURER_GEN")
    @Id
    private int id;
    @OneToMany
    private List<Modules> selectedModules;
    private int firstLogin;

    private String name;
    private String userName;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
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
