package atu.customerservice;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryInfo {
    @Min(value = 0, message = "Delivery time must be greater than or equal to 0")
    private int deliveryTime;

    @Min(value = 0, message = "Delivery price must be greater than or equal to 0")
    private double deliveryPrice;
}
