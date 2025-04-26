package com.mohan.store;

import com.mohan.store.Entity.Address;
import com.mohan.store.Entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();

		var user = User.builder()
						.name("Mohan")
						.password("password")
						.email("mohan@gmail.com")
						.build();

		var address = Address.builder()
							.street("street")
							.city("city")
							.state("state")
							.zip("zip")
							.build();

		user.addAddress(address);
		System.out.println(user);
	}

}
