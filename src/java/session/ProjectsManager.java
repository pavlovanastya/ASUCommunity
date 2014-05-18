/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
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
public class ProjectsManager {
    @PersistenceContext(unitName = "ASUCommunityPU")
    private EntityManager em;
    
    public List<Object[]> findByLogin(String login)
    {
        Query query=em.createNativeQuery("SELECT * FROM asucommunity.projects where asucommunity.projects.user_login= ? ");
        query.setParameter(1, login);
        List <Object[]> result=query.getResultList();
        return result;
    }
}
