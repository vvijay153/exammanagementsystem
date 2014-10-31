/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

/**
 *
 * @author gautamverma
 */
@Entity
public class Section {
    @TableGenerator(name="SECTION", table="SEQUENCE_TABLE", pkColumnName="SEQ_NAME",
        valueColumnName="SEQ_COUNT", pkColumnValue="SECTION_SEQ",allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="SECTION")
    @Id
    private int sectionId;
    private String name;
    List<Question> questions;
    private int sectionMarks;

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getSectionMarks() {
        return sectionMarks;
    }

    public void setSectionMarks(int sectionMarks) {
        this.sectionMarks = sectionMarks;
    }
    
   
    
}
