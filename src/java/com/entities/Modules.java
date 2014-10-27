/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

/**
 *
 * @author gautamverma
 */
@Entity
@Named
@RequestScoped
public class Modules implements Serializable{
    @TableGenerator(name="MODULES", table="SEQUENCE_TABLE", pkColumnName="SEQ_NAME",
        valueColumnName="SEQ_COUNT", pkColumnValue="MODULES_SEQ")
    @GeneratedValue(strategy=GenerationType.TABLE, generator="MODULES")
    @Id
    private int moduleId;
    private String moduleName;
    //private List<SubjectTags> subjectTags;
    @OneToOne
    private QuestionBank questionBank;
  
    @Transient
    private List<Modules>allModules;

    public List<Modules> getAllModules() {
        return allModules;
    }

    public void setAllModules(List<Modules> allModules) {
        this.allModules = allModules;
    }

    public Modules() {
    }

    Modules(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public QuestionBank getQuestionBank() {
        return questionBank;
    }

    public void setQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

   @PostConstruct
    public void moduleTest(){
        System.out.println(">>>>>>>>post");
        allModules=new ArrayList<Modules>();
        Modules m=new  Modules();
        m.moduleId=1;
        m.moduleName="testmodule";
        m.questionBank=null;
        allModules.add(m);
        System.out.println("M:"+m);
        
    }
    
    
}
