/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author gautamverma
 */
@Entity
public class MultiPart extends Question{
    
    private List<WrittenQuestion> writtenAnswers;
    private List<MultipleChoiceQuestion> multipleChoiceQuestions;
}
