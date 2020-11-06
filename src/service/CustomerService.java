package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wadek on 25/10/2020.
 */
public class CustomerService {
    private static final ArrayList<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomerCollection(String customerEmail) {
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getEmail().equals(customerEmail)) {
                customerList.add(customer);
            }
        }
        return customerList;
    }

    public void addCustomer(String email, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, email);
        customers.add(customer);
        //place holder
        Customer customer1 = new Customer("jdhcdbchkdb", "ncducnucn", "hbhbfhh@gmail.com");
        customers.add(customer1);
    }

    public Customer getCustomer(String customerEmail) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(customerEmail)) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

}
