/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author gautamverma
 */
@Entity
public class PdfAnswers {
    @Id
    private Student studentId;
    private Map<Question,String> questionAndAnswer;
   
    
}
