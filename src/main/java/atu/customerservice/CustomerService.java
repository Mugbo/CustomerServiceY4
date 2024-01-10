package atu.customerservice;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerService {
    private static final Map<String, Integer> DELIVERY_TIMES = initializeDeliveryTimes();
    private static final Map<String, Double> DELIVERY_PRICES = initializeDeliveryPrices();

    private static Map<String, Integer> initializeDeliveryTimes() {
        Map<String, Integer> deliveryTimes = new HashMap<>();
        deliveryTimes.put("Asia", 20);
        deliveryTimes.put("Africa", 23);
        deliveryTimes.put("Europe", 4);
        deliveryTimes.put("USA", 9);
        deliveryTimes.put("SA", 25);
        return deliveryTimes;
    }

    private static Map<String, Double> initializeDeliveryPrices() {
        Map<String, Double> deliveryPrices = new HashMap<>();
        deliveryPrices.put("Asia", 40.0);
        deliveryPrices.put("Africa", 62.0);
        deliveryPrices.put("Europe", 30.5);
        deliveryPrices.put("USA", 35.0);
        deliveryPrices.put("SA", 57.0);
        return deliveryPrices;
    }

    public DeliveryInfo calculateDeliveryInfo(Customer customer) {
        String region = customer.getRegion();
        int deliveryTime = getDeliveryTime(region);
        double deliveryPrice = getDeliveryPrice(region);
        return new DeliveryInfo(deliveryTime, deliveryPrice);
    }

    private int getDeliveryTime(String region) {
        return DELIVERY_TIMES.getOrDefault(region, 0);
    }

    private double getDeliveryPrice(String region) {
        return DELIVERY_PRICES.getOrDefault(region, 0.0);
    }
}
