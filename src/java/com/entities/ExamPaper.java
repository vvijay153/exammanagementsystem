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

/**
 *
 * @author gautamverma
 */
@Entity
public class ExamPaper {
    @Id
   private int examPaperId;
   private Date createdDate;
   private Date examDate;
   private int moduleCode;
   @OneToMany
   private List<Section>sections;
}
