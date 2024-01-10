package atu.customerservice;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public String confirmCustomer(Customer customer){
        return String.format("Received Customer details for %s \r\n Email - %s  \r\n Aged - %d \r\n Phone - %s \r\n Address - %s",
                customer.getName(), customer.getEmail(), customer.getAge(), customer.getPhoneNumber(), customer.getAddress());
    }
}
