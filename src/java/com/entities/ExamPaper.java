/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

/**
 *
 * @author gautamverma
 */
@Entity
public class ExamPaper {
    @TableGenerator(name="EXAMP_PAPER", table="SEQUENCE_TABLE", pkColumnName="SEQ_NAME",
        valueColumnName="SEQ_COUNT", pkColumnValue="EXAMP_PAPER_SEQ")
    @GeneratedValue(strategy=GenerationType.TABLE, generator="EXAMP_PAPER")
    @Id
   private int examPaperId;
   private Date createdDate;
   private Date examDate;
   private int moduleCode;
   @OneToMany
   private List<Section>sections;
}
