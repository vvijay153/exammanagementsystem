/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.business.QuestionEjb;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author gautamverma
 */
@Named
@RequestScoped
public class TestView {
    
    @EJB QuestionEjb questionEjb;
    public void retrieveQuestionsOnSubjectTags()
    {
        
        questionEjb.retrieveQuestionsOnSubjectTags();
    }
    
}
