/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.business.StudentEjb;
import com.entities.Student;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author gautamverma
 */
@Named
@ViewScoped
public class StudentUploadView implements Serializable{

    @EJB
    private StudentEjb studentEjb;

    private Student student;

    @PostConstruct
    public void init() {
        student = new Student();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void registerStudent() {
        Student s = new Student();
        s = student;
        studentEjb.saveStudent(s);
        System.out.println(".>>reg");
    }
}
