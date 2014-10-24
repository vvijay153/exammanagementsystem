/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import java.util.Map;
import javax.persistence.Entity;

/**
 *
 * @author gautamverma
 */
@Entity
public class MultipleChoiceQuestion extends Question{
    
    private List<String>options;
    private boolean isMultiple;
    
}
