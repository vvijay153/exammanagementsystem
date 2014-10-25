/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.entities.Modules;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author gautamverma
 */
@Named
@RequestScoped
public class selectModuleView {
    
    private Modules selectedModule;

    public Modules getSelectedModule() {
        return selectedModule;
    }

    public void setSelectedModule(Modules selectedModule) {
        this.selectedModule = selectedModule;
    }
    
    public void selectAllModuels(Modules modules)
    {
       System.out.println(">>>>>inside"+modules.getAllModules().get(0).getModuleName());
         RequestContext.getCurrentInstance().openDialog("selectModule");
    }
    
     public void onModuleChosen(SelectEvent event) {
         System.out.println(">>in event");
    }
     
     
     public void onselectedModule(Modules module){
         System.out.println(">>>selected module: "+module.getModuleName());
         this.selectedModule=module;
         
         RequestContext.getCurrentInstance().closeDialog(null);

     }
}
