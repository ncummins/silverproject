package edu.wctc.distjava.silverproject.model;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author jlombardo
 */
@Named
@Scope("session")
public class BidEAO {

    @PersistenceContext
    private EntityManager em;

    public Bid getBidById(Object id) {
        return getEntityManager().find(Bid.class, id);
    }

    /**
     * Always use this in your code -- never reference the 'em' property because
     * JPA EntityManagers are loaded on demand.
     *     
     * @return an on demand object
     */
    public EntityManager getEntityManager() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    
}
