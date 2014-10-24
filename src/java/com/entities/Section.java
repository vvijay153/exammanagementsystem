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
import javax.persistence.TableGenerator;

/**
 *
 * @author gautamverma
 */
@Entity
public class Section {
    @TableGenerator(name="SECTION", table="SEQUENCE_TABLE", pkColumnName="SEQ_NAME",
        valueColumnName="SEQ_COUNT", pkColumnValue="SECTION_SEQ")
    @GeneratedValue(strategy=GenerationType.TABLE, generator="SECTION")
    @Id
    private int sectionId;
    private String name;
    private int totMarks;
    private String sectionType;
    List<Question> questions;
    
}
