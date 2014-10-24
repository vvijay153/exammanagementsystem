/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author gautamverma
 */
@Entity
public class Section {
    
    @Id
    private int sectionId;
    private String name;
    private int totMarks;
    private String sectionType;
    List<Question> questions;
    
}
