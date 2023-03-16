package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.factory.CustomerFactory;
import edu.bu.met.cs665.factory.FactoryMethod;
import edu.bu.met.cs665.model.CustomerType;
import org.junit.Test;

// Unit test for each customer showing implementation of factory method

public class TestEmailGeneration {

  @Test
  public void testForBusinessCustomer() {

    FactoryMethod factory = new CustomerFactory();

    Customer customer = factory.createCustomer(CustomerType.BUSINESS);

    customer.generateEmail();

    String actual = "Bulk order Approved" + "\n" + "Thanks for being a Business partner";
    assertEquals(customer.generateEmail(), actual);

  }

  @Test
  public void testForFrequentCustomer() {

    FactoryMethod factory = new CustomerFactory();

    Customer customer = factory.createCustomer(CustomerType.FREQUENT);

    customer.generateEmail();

    String actual = "Enjoy your 15% Discount coupon" + "\n" + "We are happy to have you as our loyal customer.";
    assertEquals(customer.generateEmail(), actual);

  }

  @Test
  public void testForNewCustomer() {

    FactoryMethod factory = new CustomerFactory();

    Customer customer = factory.createCustomer(CustomerType.NEW);

    customer.generateEmail();

    String actual = "Welcome! our precious customer" + "\n" + "Explore our wide range of products that fits your personality";
    assertEquals(customer.generateEmail(), actual);

  }

  @Test
  public void testForReturningCustomer() {

    FactoryMethod factory = new CustomerFactory();

    Customer customer = factory.createCustomer(CustomerType.RETURNING);

    customer.generateEmail();

    String actual = "We missed you!" + "\n" + "Thanks for joining again, we are happy to help you find the best product";
    assertEquals(customer.generateEmail(), actual);

  }

  @Test
  public void testForVipCustomer() {

    FactoryMethod factory = new CustomerFactory();

    Customer customer = factory.createCustomer(CustomerType.VIP);

    customer.generateEmail();

    String actual = "Enjoy our premium products at GREAT Discounts" + "\n" + "We appreciate you to become our VIP Member. Here is your 50% discount. ";
    assertEquals(customer.generateEmail(), actual);

  }

}
