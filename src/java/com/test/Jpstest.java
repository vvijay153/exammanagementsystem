/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.entities.Menu;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gautamverma
 */
@ViewScoped
@Named
public class Jpstest implements Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    EntityManager em;
    @EJB
    TestclEjb te;

    private TestCl tcl;

    @PostConstruct
    public void init() {
        tcl=new TestCl();
    }

    public TestCl getTcl() {
        return tcl;
    }

    public void setTcl(TestCl tcl) {
        this.tcl = tcl;
    }

    public void all() {
        try {
            System.out.println("in z All");
            //TestCl t=em.find(TestCl.class, 1);
            System.out.println(tcl.getName());
            te.updateme();
//        if(null==t){
//            System.out.println("null");
//        }else
//        {
//            System.out.println(t.getName());
//            t.setName("gautam");
//            em.close();
//        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
