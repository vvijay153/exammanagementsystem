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
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

/**
 *
 * @author gautamverma
 */
@Entity
public class QuestionBank {
    @TableGenerator(name="QUESTIONBANK", table="SEQUENCE_TABLE", pkColumnName="SEQ_NAME",
        valueColumnName="SEQ_COUNT", pkColumnValue="QUESTIONBANK_SEQ")
    @GeneratedValue(strategy=GenerationType.TABLE, generator="QUESTIONBANK")
    @Id
    private int questionBankId;
    
    @OneToMany        
    List<Question>questions;
}
