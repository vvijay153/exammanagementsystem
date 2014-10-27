/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author gautamverma
 */
@Entity
@Named
@RequestScoped
public class Student extends User {
    private List<Modules> modulesEnrolled;

    public List<Modules> getModulesEnrolled() {
        return modulesEnrolled;
    }

    public void setModulesEnrolled(List<Modules> modulesEnrolled) {
        this.modulesEnrolled = modulesEnrolled;
    }

    public Student() {
    }
    
    
    
}
