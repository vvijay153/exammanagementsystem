/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author gautamverma
 */
@Named
@RequestScoped
public class viewTest {
    
    private boolean ret=true;
    private List<String>me;

    public boolean isRet() {
        return ret;
    }

    public List<String> getMe() {
        me=new ArrayList<String>();
        me.add("d");me.add("f");
        return me;
    }

    public void setMe(List<String> me) {
        this.me = me;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }
    
    
}
