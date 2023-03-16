package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.model.CustomerType;

/**
 * Author: Varunkumar G S
 * Email: gsv@bu.edu
 * Date: 03/16/2023
 * Description: Class for Email definition.
 **/

public interface FactoryMethod {

    Customer createCustomer(CustomerType type);
}
