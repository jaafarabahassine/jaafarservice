package com.jaafarabahassine.customer.entities;

import com.jaafarabahassine.customer.entities.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer",types = Customer.class)
public interface CustomerProjection {
    public Long getId();
    public String getName();
    public String getEmail();
}
