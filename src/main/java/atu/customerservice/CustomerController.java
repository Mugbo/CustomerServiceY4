package atu.customerservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final OrderServiceClient orderServiceClient;
    private final CustomerService customerService;


    @Autowired
    public CustomerController(OrderServiceClient orderServiceClient, CustomerService customerService) {
        this.orderServiceClient = orderServiceClient;
        this.customerService = customerService;
    }

    @PostMapping("/confirmCustomer")
    public Customer confirmCustomerRegistration(@RequestBody Customer customer){
        return orderServiceClient.customerDetails(customer);
    }
    @PostMapping("/confirmCustomerLocal")
    public String confirmCustomerRegistrationMessage(@RequestBody Customer customer){
        return customerService.confirmCustomer(customer);
    }
}