/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author gautamverma
 */
@Entity
public class Question {
    @Id
    private int questionId;
    @OneToMany
    private List<SubjectTags> subjectTags;
           private int versionNumber;
           private Date createdDate;
           private Lecturer createdBy;
           private int mark;
           private String questionText;
           @Transient
           private int completed;
                   
}
