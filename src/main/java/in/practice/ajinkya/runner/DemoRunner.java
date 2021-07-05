package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.product.Product;

@Component
public class DemoRunner implements CommandLineRunner {
	@Autowired
	private Product prod;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside Runner Class...");
		System.out.println(prod);
	}

}
