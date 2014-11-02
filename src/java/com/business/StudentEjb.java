/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.entities.Question;
import com.entities.Question_;
import com.entities.Student;
import com.entities.SubjectTags;
import com.entities.Admin;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

/**
 *
 * @author gautamverma
 */
@Stateful
public class StudentEjb {
    
    @PersistenceContext EntityManager em;
    
    public  void saveStudent(Student student)
    {

      //  System.out.println("<<<<"+student.getName());
      //  
        try{
        em.merge(student);
        }catch(Exception e){e.printStackTrace();}
    }
    
    
    public Student findStudent(String userName)
    {
        System.out.println("FINFIN:"+userName);
//        TypedQuery<Student> s=em.createQuery("select u from Admin u where u.userName =:userName",Student.class);
//        s.setParameter("username", userName);
//        System.out.println(">>>>"+s.getResultList().get(0).getName());
//        return s.getResultList().get(0);
        TypedQuery<Student> student=null;
        try{
                    System.out.println("==================================");
            student=em.createQuery("select s from Student s where s.userName =:username",Student.class);
            student.setParameter("username", userName);
        System.out.println("=================================="+student.getResultList().get(0).getId());
        //System.out.println(st.getResultList().get(0).getName());
        //System.out.println(st.getName());
        }catch(Exception e){e.printStackTrace();}
        
        
        
        
        
        return student.getResultList().get(0);
    }
    
}
