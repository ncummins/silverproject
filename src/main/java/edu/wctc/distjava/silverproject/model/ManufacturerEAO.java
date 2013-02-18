package edu.wctc.distjava.silverproject.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jlombardo
 */
@Stateless
public class ManufacturerEAO {

    @PersistenceContext(unitName = "silverprojectPU")
    private EntityManager em;

    public Manufacturer getManufacturerById(Object id) {
        return getEntityManager().find(Manufacturer.class, id);
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
}
