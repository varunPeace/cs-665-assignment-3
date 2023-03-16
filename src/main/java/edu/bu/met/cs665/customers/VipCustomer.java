package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.model.Email;

/**
 * Author: Varunkumar G S
 * Email: gsv@bu.edu
 * Date: 03/16/2023
 * Description: Class for Email definition.
 **/

public class VipCustomer implements Customer {
    private Email email = new Email();

    @Override
    public String generateEmail() {
        email.setSubjectLine("Enjoy our premium products at GREAT Discounts");
        email.setBody("We appreciate you to become our VIP Member. Here is your 50% discount. ");
        return email.toString();
    }
}
