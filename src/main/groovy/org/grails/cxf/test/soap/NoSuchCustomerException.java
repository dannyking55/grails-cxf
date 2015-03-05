
package org.grails.cxf.test.soap;

import javax.xml.ws.WebFault;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2012-07-26T15:19:18.116-04:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "NoSuchCustomer", targetNamespace = "http://customerservice.example.com/")
public class NoSuchCustomerException extends Exception {
    
    private NoSuchCustomer noSuchCustomer;

    public NoSuchCustomerException() {
        super();
    }

    public NoSuchCustomerException(String message) {
        super(message);
    }

    public NoSuchCustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchCustomerException(String message, NoSuchCustomer noSuchCustomer) {
        super(message);
        this.noSuchCustomer = noSuchCustomer;
    }

    public NoSuchCustomerException(String message, NoSuchCustomer noSuchCustomer, Throwable cause) {
        super(message, cause);
        this.noSuchCustomer = noSuchCustomer;
    }

    public NoSuchCustomer getFaultInfo() {
        return this.noSuchCustomer;
    }
}