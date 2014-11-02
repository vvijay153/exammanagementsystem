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
import javax.persistence.OneToOne;

/**
 *
 * @author gautamverma
 */
@Entity
@Named
@RequestScoped
public class Student extends User {
    private List<Modules> modulesEnrolled;
    private int firstLogin;
    
    @OneToOne
    private List<ExamPaper> examsCompleted;

    public List<ExamPaper> getExamsCompleted() {
        return examsCompleted;
    }

    public void setExamsCompleted(List<ExamPaper> examsCompleted) {
        this.examsCompleted = examsCompleted;
    }
    
    

    public int getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(int firstLogin) {
        this.firstLogin = firstLogin;
    }

    public List<Modules> getModulesEnrolled() {
        return modulesEnrolled;
    }

    public void setModulesEnrolled(List<Modules> modulesEnrolled) {
        this.modulesEnrolled = modulesEnrolled;
    }

    public Student() {
    }
    
    
    
}
