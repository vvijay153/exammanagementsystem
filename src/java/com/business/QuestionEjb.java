/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.entities.Question;
import com.entities.SubjectTags;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author gautamverma
 */
@Stateful
public class QuestionEjb {

    @PersistenceContext
    EntityManager em;

    public List<SubjectTags> retrieveQuestionsOnSubjectTags() {
        TypedQuery<SubjectTags> st = null;
        try {
            System.out.println("in retrieve sub texts");
            st = em.createQuery("select s from SubjectTags s", SubjectTags.class);
            for (SubjectTags s : st.getResultList()) {
                System.out.println("sub name:" + s.getSubjectTagname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return st.getResultList();
    }

    public List<Question> findAllQuestionsForSubjectTag(List<Integer> subjectTags) {
        List idList = new ArrayList();

        try {
            System.out.println("sub tagss:" + subjectTags.size());

            for (int i = 0; i < subjectTags.size(); i++) {

                idList.add(subjectTags.get(i));
            }
            System.out.println("idlist:" + idList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TypedQuery<Question> questions = em.createQuery("Select q from Question q ,IN (q.subjectTags) st where st.subjectTagId In :subjectTagIDs ", Question.class);
         questions.setParameter("subjectTagIDs", idList);
          System.out.println("SIZE:" + questions.getResultList().size());
        return questions.getResultList();
        
    }

}
