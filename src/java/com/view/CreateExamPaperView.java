/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.business.ModuleEjb;
import com.entities.ExamPaper;
import com.entities.Modules;
import com.entities.Question;
import com.entities.QuestionBank;
import com.entities.WrittenQuestion;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
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
    private WrittenQuestion writtenQuestion;
    private ExamPaper examPaper;
    private QuestionBank questionBank;
    private String moduleName;
    private List<Question> SectionAQuestion;
    private List<Question> SectionBQuestion;
    private List<Question> SectionCQuestion;
    private List<Question> SectionDQuestion;

    public List<Question> getSectionAQuestion() {
        return SectionAQuestion;
    }

    public void setSectionAQuestion(List<Question> SectionAQuestion) {
        this.SectionAQuestion = SectionAQuestion;
    }

    public List<Question> getSectionBQuestion() {
        return SectionBQuestion;
    }

    public void setSectionBQuestion(List<Question> SectionBQuestion) {
        this.SectionBQuestion = SectionBQuestion;
    }

    public List<Question> getSectionCQuestion() {
        return SectionCQuestion;
    }

    public void setSectionCQuestion(List<Question> SectionCQuestion) {
        this.SectionCQuestion = SectionCQuestion;
    }

    public List<Question> getSectionDQuestion() {
        return SectionDQuestion;
    }

    public void setSectionDQuestion(List<Question> SectionDQuestion) {
        this.SectionDQuestion = SectionDQuestion;
    }

    public WrittenQuestion getWrittenQuestion() {
        return writtenQuestion;
    }

    public void setWrittenQuestion(WrittenQuestion writtenQuestion) {
        this.writtenQuestion = writtenQuestion;
    }

    public List<Modules> getAllModules() {
        return allModules;
    }

    public void setAllModules(List<Modules> allModules) {
        this.allModules = allModules;
    }

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

        if (SectionAQuestion == null) {
            SectionAQuestion = new ArrayList<>();
        }
        if (SectionBQuestion == null) {
            SectionBQuestion = new ArrayList<>();
        }
        if (SectionCQuestion == null) {
            SectionCQuestion = new ArrayList<>();
        }
        if (SectionDQuestion == null) {
            SectionDQuestion = new ArrayList<>();
        }
    }

    public void addQuestionSectionA() {

        questionBank.setQuestions(moduleEjb.findAllQuestionsForModule(questionBank.getModule().getModuleId()));
        RequestContext.getCurrentInstance().openDialog("selectQuestionA");

    }
    public void addQuestionSectionB() {

        questionBank.setQuestions(moduleEjb.findAllQuestionsForModule(questionBank.getModule().getModuleId()));
        RequestContext.getCurrentInstance().openDialog("selectQuestionB");

    }

    public Modules getSelectedModule() {

        return selectedModule;
    }

    public void setSelectedModule(Modules selectedModule) {
        this.selectedModule = selectedModule;
    }

    public void selectAllModules() {
        //selectedModule.setAllModules(moduleEjb.allModules());

        allModules = moduleEjb.allModules();

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
        //System.out.println("in selectted");
        //System.out.println(">>>>>" + module.getModuleName());
        this.selectedModule = module;
        questionBank.setModule(module);

        RequestContext.getCurrentInstance().closeDialog(module);

    }

    public void onSelectOfQuestion() {
      //  System.out.println(questionBank.getModule().getModuleId());

        //System.out.println(">>>question "+questionBank.getModule().getQuestionBank().getQuestions().size());
    }

    public void addSelectedQuestionSectionA(Question selectedQuestion) {

        if (SectionAQuestion.size() == 0) {
            SectionAQuestion.add(selectedQuestion);
            selectedQuestion.getQuestionText();
            System.out.println("addselectedquestion:" + selectedQuestion.getQuestionText());

        } else {
            int j = 0;
            for (int i = 0; i < SectionAQuestion.size(); i++) {

                Question q = (Question) SectionAQuestion.get(i);
                System.out.println(q.getQuestionText() + " " + selectedQuestion.getQuestionText());
                if ((q.getQuestionText().equalsIgnoreCase(selectedQuestion.getQuestionText()))) {
                    j = 1;
                    break;
                }

            }
            if (j == 0) {
                SectionAQuestion.add(selectedQuestion);
                selectedQuestion.getQuestionText();
                System.out.println("addselectedquestion2:" + selectedQuestion.getQuestionText());
            }

        }
        System.out.println("addselectedquestion:" + SectionAQuestion.size());
        RequestContext.getCurrentInstance().closeDialog(null);

    }

    public void addSelectedQuestionSectionB(Question selectedQuestion) {

        if (SectionBQuestion.size() == 0) {
            SectionBQuestion.add(selectedQuestion);
            selectedQuestion.getQuestionText();
            System.out.println("addselectedquestion:" + selectedQuestion.getQuestionText());

        } else {
            int j = 0;
            for (int i = 0; i < SectionBQuestion.size(); i++) {

                Question q = (Question) SectionBQuestion.get(i);
                System.out.println(q.getQuestionText() + " " + selectedQuestion.getQuestionText());
                if ((q.getQuestionText().equalsIgnoreCase(selectedQuestion.getQuestionText()))) {
                    j = 1;
                    break;
                }

            }
            if (j == 0) {
                SectionBQuestion.add(selectedQuestion);
                selectedQuestion.getQuestionText();
                System.out.println("addselectedquestion2:" + selectedQuestion.getQuestionText());
            }

        }
        System.out.println("addselectedquestion:" + SectionBQuestion.size());
        RequestContext.getCurrentInstance().closeDialog(null);

    }
    
    
    public void createExamPaper() {

    }

}
