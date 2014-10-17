/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class Lecturer {

    private List<Modules> modulesTaught;
    private String lecturerId;
    private String lecturerName;

    public List<Modules> getModulesTaught() {
        return modulesTaught;
    }

    public void setModulesTaught(List<Modules> modulesTaught) {
        this.modulesTaught = modulesTaught;
    }

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

}
