/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.business.ModuleEjb;
import com.entities.Modules;
import com.entities.QuestionBank;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author gautamverma
 */
@Named
@SessionScoped
public class CreateExamPaperView implements Serializable {

    @EJB
    private ModuleEjb moduleEjb;
    private Modules selectedModule;
    private List<Modules> allModules;

    public List<Modules> getAllModules() {
        return allModules;
    }

    public void setAllModules(List<Modules> allModules) {
        this.allModules = allModules;
    }
    private QuestionBank questionBank;
    private String moduleName;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public QuestionBank getQuestionBank() {
        return questionBank;
    }

    public void setQuestionBank(QuestionBank questionBank) {
        this.questionBank = questionBank;
    }

    @PostConstruct
    public void init() {
        if (selectedModule == null) {
            selectedModule = new Modules();
        }
        if (questionBank == null) {
            System.out.println("nullq");
            questionBank = new QuestionBank();
        }
    }


public void addQuestion() {
    
        questionBank.setQuestions(moduleEjb.findAllQuestionsForModule(questionBank.getModule().getModuleName()));
        RequestContext.getCurrentInstance().openDialog("selectQuestion");

    }

    public Modules getSelectedModule() {

        return selectedModule;
    }

    public void setSelectedModule(Modules selectedModule) {
        this.selectedModule = selectedModule;
    }

    public void selectAllModules() {
        //selectedModule.setAllModules(moduleEjb.allModules());
        
        
        allModules=moduleEjb.allModules();
        
        //questionBank=moduleEjb.findQuestionBank();
       // this.moduleName=questionBank.getModule().getModuleName();
      //  System.out.println("all mod: "+);
        //questionBank.getModule().setAllModules(moduleEjb.allModules());
        // questionBank.getModules().setAllModules(moduleEjb.allModules());
        RequestContext.getCurrentInstance().openDialog("selectModule");
    }

    public void onModuleChosen(SelectEvent event) {
System.out.println("in event");
    }

    public void onselectedModule(Modules module) {
        System.out.println("in selectted");
        System.out.println(">>>>>" + module.getModuleName());
        this.selectedModule = module;
        questionBank.setModule(module);

        RequestContext.getCurrentInstance().closeDialog(module);

    }

}
