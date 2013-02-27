package edu.wctc.distjava.silverproject.model;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jlombardo
 */
@Named
@Stateless
public class BidEAO {

    @PersistenceContext(unitName = "silverprojectPU")
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
