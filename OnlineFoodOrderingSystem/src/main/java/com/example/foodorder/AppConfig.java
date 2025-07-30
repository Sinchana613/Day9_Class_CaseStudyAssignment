package com.example.foodorder;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	 @Bean
	    public Customer customer() {
	        return new Customer("sinchana", "9876543210", "Indian");
	    }

	    @Bean
	    public Restaurant r1() {
	        return new Restaurant("Spice Hub", "Bangalore", new String[]{"Indian", "Chinese"});
	    }

	    @Bean
	    public Restaurant r2() {
	        return new Restaurant("Pizza Place", "Bangalore", new String[]{"Italian", "Fast Food"});
	    }

	    @Bean
	    public List<Restaurant> restaurants() {
	        return Arrays.asList(r1(), r2());
	    }

	    @Bean
	    public FoodOrderService orderService() {
	        return new FoodOrderService(customer(), restaurants());
	    }
}
