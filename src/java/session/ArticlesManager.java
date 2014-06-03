/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.Articles;
import entity.Categories;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author mazafaka
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ArticlesManager {
    @PersistenceContext(unitName = "ASUCommunityPU")
    private EntityManager em;
    
    public List<Articles> findNews()
    {
        Query query=em.createNamedQuery("Articles.findBySection",Articles.class).setParameter("section", "Новости");
        List<Articles> result=query.getResultList();
        return result;
    }
    
    public List<Articles> findForum()
    {
        Query query=em.createNamedQuery("Articles.findBySection",Articles.class).setParameter("section", "Форум");
        List<Articles> result=query.getResultList();
        return result;
    }
    
    public List<Object[]> findMessages(Integer id)
    {
        Query query=em.createNativeQuery("SELECT * FROM asucommunity.messages where articles_id= ?" );
        query.setParameter(1, id);
        List<Object[]> result=query.getResultList();
        return result;
    }
    
    public List<Articles> findNewsBySectionAndTitle(String search)
    {
        Query query=em.createNamedQuery("Articles.findByTitle", Articles.class).setParameter("title", search);
        List<Articles> result=query.getResultList();
        List<Articles> res=new ArrayList<Articles>();
        for(Articles a:result)
        {
            if(a.getSection().equals("Новости"))
                res.add(a);
        }
        return res;
    }
    
    public List<Articles> findNewsByCategory(String search)
    {
        Query query=em.createNamedQuery("Articles.findBySection",Articles.class).setParameter("section", "Новости");
        List<Articles> all=query.getResultList();
        List<Articles> res=new ArrayList<Articles>();
        for(Articles a:all)
        {
            List<Categories> result=a.getCategoriesList();
            for(Categories b:result)
            {
                if(b.getName().equals(search))
                {
                    res.add(a);
                    System.out.println(a);
                }
            }
        }
        return res;
    }
    
    public List<Articles> findNewsByDate(String search)
    {
        Query query=em.createNamedQuery("Articles.findBySection",Articles.class).setParameter("section", "Новости");
        List<Articles> all=query.getResultList();
        List<Articles> res=new ArrayList<Articles>();
        for(Articles a:all)
        {
            if(a.getDate().equals(search))
                res.add(a);
        }
        return res;
    }
    
    public List<Articles> findForumBySectionAndTitle(String search)
    {
        Query query=em.createNamedQuery("Articles.findByTitle", Articles.class).setParameter("title", search);
        List<Articles> result=query.getResultList();
        List<Articles> res=new ArrayList<Articles>();
        for(Articles a:result)
        {
            if(a.getSection().equals("Форум"))
                res.add(a);
        }
        return res;
    }
    
    public List<Articles> findForumByCategory(String search)
    {
        Query query=em.createNamedQuery("Articles.findBySection",Articles.class).setParameter("section", "Форум");
        List<Articles> all=query.getResultList();
        List<Articles> res=new ArrayList<Articles>();
        for(Articles a:all)
        {
            List<Categories> result=a.getCategoriesList();
            for(Categories b:result)
            {
                if(b.getName().equals(search))
                    res.add(a);
            }
        }
        return res;
    }
    
    public List<Articles> findForumByDate(String search)
    {
        Query query=em.createNamedQuery("Articles.findBySection",Articles.class).setParameter("section", "Форум");
        List<Articles> all=query.getResultList();
        List<Articles> res=new ArrayList<Articles>();
        for(Articles a:all)
        {
            if(a.getDate().toString().equals(search))
                res.add(a);
        }
        return res;
    }
}
