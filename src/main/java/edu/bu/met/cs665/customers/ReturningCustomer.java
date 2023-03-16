package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.model.Email;

/**
 * Author: Varunkumar G S
 * Email: gsv@bu.edu
 * Date: 03/16/2023
 * Description: Class for Email definition.
 **/

public class ReturningCustomer implements Customer {
    private Email email = new Email();

    @Override
    public String generateEmail() {
        email.setSubjectLine("We missed you!");
        email.setBody("Thanks for joining again, we are happy to help you find the best product");
        return email.toString();
    }
}
