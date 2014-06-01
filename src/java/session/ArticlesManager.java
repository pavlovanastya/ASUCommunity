/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.Articles;
import entity.Messages;
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
    
    public List<Articles> findBySection()
    {
        Query query=em.createNamedQuery("Articles.findBySection",Articles.class).setParameter("section", "Новости");
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
}
