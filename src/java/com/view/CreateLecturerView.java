/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.entities.Lecturer;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author gautamverma
 */
@Named
@ViewScoped
public class CreateLecturerView {
    
    
    private Lecturer lecturer;

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
    
    
    
}
