/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author gautamverma
 */
public class ExamPaper {
   private int examId;
   private Date createdDate;
   private int moduleCode;
   private List<Section>sections;
}
