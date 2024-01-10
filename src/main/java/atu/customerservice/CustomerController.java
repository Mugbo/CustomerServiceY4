package atu.customerservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final OrderServiceClient orderServiceClient;
    @Autowired
    public CustomerController(OrderServiceClient orderServiceClient) {
        this.orderServiceClient = orderServiceClient;
    }

    @PostMapping("/confirmCustomer")
    public Customer confirmCustomerRegistration(@RequestBody Customer customer){
        return orderServiceClient.customerDetails(customer);
    }
}