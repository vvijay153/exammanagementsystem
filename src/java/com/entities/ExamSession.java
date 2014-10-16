/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author gautamverma
 */
public class ExamSession {
    private int sessionId;
    private int examId;
    private Date date;
    private Time startTime;
    private double duration;
    private int courseCode;
    private String location;
}
