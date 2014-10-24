/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author gautamverma
 */
@Entity
public class ExamSession {
    
    @Id
    private int sessionId;
    private int examPaperId;
    private Date date;
    private Time startTime;
    private double duration;
    private int courseCode;
    private String location;
    private Student student;
    private Admin invigilator;
    
}
