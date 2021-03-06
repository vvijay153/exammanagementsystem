/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 *
 * @author gautamverma
 */
@Entity
public class PdfAnswers {
    @TableGenerator(name="PDFANSWERS", table="SEQUENCE_TABLE", pkColumnName="SEQ_NAME",
        valueColumnName="SEQ_COUNT", pkColumnValue="PDFANSWERS_SEQ",allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="PDFANSWERS")
    @Id
    private Student studentId;
    private Map<Question,String> questionAndAnswer;
   
    
}
