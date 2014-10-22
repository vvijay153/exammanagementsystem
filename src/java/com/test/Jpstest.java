/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gautamverma
 */
@Stateless
@Named
public class Jpstest {
    @PersistenceContext EntityManager em;
    
    public void getAll()
    {
        System.out.println("in get All");
        TestCl t=em.find(TestCl.class, 1);
        if(null==t){
            System.out.println("null");
        }else
        {
            System.out.println(t.getName());
        }
    }
}
