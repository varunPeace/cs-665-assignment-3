package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.customers.*;
import edu.bu.met.cs665.model.CustomerType;

/**
 * Author: Varunkumar G S
 * Email: gsv@bu.edu
 * Date: 03/16/2023
 * Description: Class for Email definition.
 **/

public class CustomerFactory implements FactoryMethod {
    @Override
    public Customer createCustomer(CustomerType type) {
        switch (type) {
            case BUSINESS:
                return new BusinessCustomer();
            case FREQUENT:
                return new FrequentCustomer();
            case NEW:
                return new NewCustomer();
            case RETURNING:
                return new ReturningCustomer();
            case VIP:
                return new VipCustomer();
            default:
                return null;
        }
    }
}
