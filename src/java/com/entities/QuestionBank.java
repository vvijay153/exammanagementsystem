/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

/**
 *
 * @author gautamverma
 */
@Entity
@Named
@RequestScoped
public class QuestionBank {
    @TableGenerator(name="QUESTIONBANK", table="SEQUENCE_TABLE", pkColumnName="SEQ_NAME",
        valueColumnName="SEQ_COUNT", pkColumnValue="QUESTIONBANK_SEQ")
    @GeneratedValue(strategy=GenerationType.TABLE, generator="QUESTIONBANK")
    @Id
    private int questionBankId;
    
    @OneToMany        
    List<Question>questions;
    
    @Transient
    List<String>questionTypes;
    @Transient
    private String selectedQuestionType;

    public String getSelectedQuestionType() {
        return selectedQuestionType;
    }

    public void setSelectedQuestionType(String selectedQuestionType) {
        this.selectedQuestionType = selectedQuestionType;
    }
    
    public List<String> getQuestiontypes() {
        questionTypes=new ArrayList<String>();
        questionTypes.add("Multiple Type Question");
        questionTypes.add("Multi Part Question");
        questionTypes.add("Written Question");
        return questionTypes;
    }

    public void setQuestiontypes(List<String> questionTypes) {
        this.questionTypes = questionTypes;
    }
    
    
    public void selectQuestionTypeListener()
    {
        
        System.out.println(selectedQuestionType);
    }
    
}
