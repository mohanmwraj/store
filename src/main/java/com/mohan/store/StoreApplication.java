package com.mohan.store;

import com.mohan.store.entities.Address;
import com.mohan.store.entities.Profile;
import com.mohan.store.entities.User;
import com.mohan.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

		var repository = context.getBean(UserRepository.class);

		//repository.findAll().forEach(U -> System.out.println(U.getEmail()));
//		var user = User.builder()
//							.name("John")
//							.email("john@gmail.com")
//							.password("password")
//							.build();
//
//		repository.save(user);
//		//System.out.println(repository.findById(user.getId()));
//
//		var userDetails = repository.findById(1L).orElseThrow();
//		System.out.println(userDetails.getEmail());

		//repository.findAll().forEach(u -> System.out.println(u.getEmail()));
		repository.deleteById(1L);

/// //////////////////////////////////////////////////////////////////////////////
//		var orderService = context.getBean(OrderService.class);
//		orderService.placeOrder();
//
//		var user = User.builder()
//						.name("Mohan")
//						.password("password")
//						.email("mohan@gmail.com")
//						.build();
//
//		var address = Address.builder()
//							.street("street")
//							.city("city")
//							.state("state")
//							.zip("zip")
//							.build();
//
//		user.addAddress(address);
//
//		user.addTag("tag1");
//
//		var profile = Profile.builder()
//								.bio("bio")
//								.build();
//
//		user.setProfile(profile);
//		profile.setUser(user);
//
//		System.out.println(user);
	}

}
