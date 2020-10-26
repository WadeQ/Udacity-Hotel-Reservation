package service;

import model.Customer;
import java.util.Collection;

/**
 * Created by Wadek on 25/10/2020.
 */
public interface CustomerService {

    void addCustomer(String email, String firstName, String lastName) ;

    Customer getCustomer(String customerEmail);

    static Collection<Customer> getCustomerCollection(String customerEmail) {
        return null;
    }

    Collection<Customer> getAllCustomers();

}
