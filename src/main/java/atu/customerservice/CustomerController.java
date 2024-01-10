package atu.customerservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;


    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/calculateDelivery")
    public DeliveryInfo calculateDelivery(@RequestBody Customer customer) {
        return customerService.calculateDeliveryInfo(customer);
    }
}