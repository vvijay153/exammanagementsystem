/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gautamverma
 */
@Stateful
public class TestclEjb {
    
    @PersistenceContext EntityManager em;
    
    public void updateme(){
        
        //TestCl t=em.find(TestCl.class, 1);
        //if(null!=t)System.out.println(t.getName());
          TestCl tt=new TestCl();
          tt.setName("e");
          
          em.persist(tt);
        //  tt.setName("gautam");
          
          //t.setName("hello");
        System.out.println(">>>>>:");
    }
    
}
