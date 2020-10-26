package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Wadek on 25/10/2020.
 */
public class Customer {
    public final String firstName;
    public final String lastName;
    public String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        emailValidate(email);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void emailValidate(String email) {
            Matcher matcher = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}(.[a-z]{2,3})+$|^$",
                    Pattern.CASE_INSENSITIVE).matcher(email);
            if (!matcher.matches()) throw new IllegalArgumentException("Email is invalid!");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
