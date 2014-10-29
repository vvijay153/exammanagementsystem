/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;

/**
 *
 * @author gautamverma
 */
@Entity
public class ExamSession {
    
    @TableGenerator(name="EXAMP_SESSION", table="SEQUENCE_TABLE", pkColumnName="SEQ_NAME",
        valueColumnName="SEQ_COUNT", pkColumnValue="EXAMP_SESSION_SEQ",allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="EXAMP_SESSION")
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
    private ExamPaper examPaper;
    @Transient
    private boolean currentRunningStatus;
    
}
