package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.model.Email;

/**
 * Author: Varunkumar G S
 * Email: gsv@bu.edu
 * Date: 03/16/2023
 * Description: Class for Email definition.
 **/

public class NewCustomer implements Customer {
    private Email email = new Email();

    @Override
    public String generateEmail() {
        email.setSubjectLine("Welcome! our precious customer");
        email.setBody("Explore our wide range of products that fits your personality");
        return email.toString();
    }
}
