package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.model.Email;

/**
 * Author: Varunkumar G S
 * Email: gsv@bu.edu
 * Date: 03/16/2023
 * Description: Class for Email definition.
 **/

public class BusinessCustomer implements Customer {
    private Email email = new Email();

    @Override
    public String generateEmail() {
        email.setSubjectLine("Bulk order Approved");
        email.setBody("Thanks for being a Business partner");
        return email.toString();
    }
}
