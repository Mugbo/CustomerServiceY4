package atu.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Order-service", url = "http://localhost:8083")
public interface OrderServiceClient {
    @PostMapping("/OrderConfirmation")
    Customer someDetails(@RequestBody Customer customer);
}
