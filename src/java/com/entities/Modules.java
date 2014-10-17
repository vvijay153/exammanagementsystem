/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author gautamverma
 */

public class Modules {
    private int moduleId;
    private String moduleName;
    private List<SubjectTags> subjectTags;

 
    Modules(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<SubjectTags> getSubjectTags() {
        return subjectTags;
    }

    public void setSubjectTags(List<SubjectTags> subjectTags) {
        this.subjectTags = subjectTags;
    }
    
    
}
