/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author gautamverma
 */
@Named
@RequestScoped
public class viewTest {
    @Inject TimerTest timerTest;

    private boolean ret = true;
    private List<String> me;


    public boolean isRet() {
        return ret;
    }

    public List<String> getMe() {
        System.out.println(">>>>>in here");
       // timerTest.inpost();
        me = new ArrayList<String>();
        me.add("d");
        me.add("f");

        return me;
    }

    public void setMe(List<String> me) {
        this.me = me;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }
    
   

}
