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

@RequestScoped
@Named
public class Lecturer {

    private List<String> selectedModules;
    private String lecturerId;
    private String lecturerName;
    private String username;
    private String password;

   /* public List<String> getSelectedModules() {
        
        List <String> modulesList = new ArrayList<>();
        modulesList.add(("oodp"));
        modulesList.add(("Jave"));
        modulesList.add(("EI"));
        return modulesList;
    }

    */
    

    /*public List<Modules> getModulesList() {
        List <Modules> modulesList = new ArrayList<>();
        modulesList.add(new Modules("oodp"));
        modulesList.add(new Modules("Jave"));
        modulesList.add(new Modules("EI"));
        return modulesList;
    } */

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public List<String> getSelectedModules() {
        return selectedModules;
    }

    public void setSelectedModules(List<String> selectedModules) {
        this.selectedModules = selectedModules;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    @Override
    public String toString() {
        return "Lecturer{" + "selectedModules=" + selectedModules + ", lecturerId=" + lecturerId + ", lecturerName=" + lecturerName + '}';
    }
    
    
}
