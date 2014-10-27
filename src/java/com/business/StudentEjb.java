/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.entities.Student;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author gautamverma
 */
@Stateful
public class StudentEjb {
    
    @PersistenceContext EntityManager em;
    
    public  void saveStudent(Student student)
    {

        System.out.println("<<<<"+student.getName());
        
        try{
        em.merge(student);
        }catch(Exception e){e.printStackTrace();}
    }
    
    
}
