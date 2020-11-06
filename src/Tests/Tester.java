package Tests;

import model.Customer;

/**
 * Created by Wadek on 25/10/2020.
 */
public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("fist", "second", "j@domain.com");
        System.out.println(customer);
    }
}
