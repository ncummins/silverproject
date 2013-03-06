package edu.wctc.distjava.silverproject.controller;

import edu.wctc.distjava.silverproject.model.Bid;
import edu.wctc.distjava.silverproject.model.BidEAO;
import java.io.Serializable;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;

/**
 * A sample JSF Managed Bean
 * @author  jlombardo
 * @version 1.00
 */
@Named
@Scope("session")
public class SampleBean implements Serializable {
    // Incremement this with each structural class change
    private static final long serialVersionUID = 1L;
    @Inject
    private BidEAO eao;
    private String message = "Hello From CDI-JSF Managed Bean";

    /**
     * Creates a new instance of SampleBean
     */
    public SampleBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getBidById(String id) {
        Bid bid = eao.getBidById(new Integer(id));
        return bid.toString();
    }
}
