package com.service.InventoryService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.service.InventoryService.entities.Product;
import com.service.InventoryService.dao.ProductRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean 
	CommandLineRunner startCommandLineRunner(ProductRepository produitdao,  RepositoryRestConfiguration restconfg) {
		restconfg.exposeIdsFor(Product.class); 
		return arg->{
			produitdao.save(new Product(null, "Iphone 12 Pro Max", 145, 5));
			produitdao.save(new Product(null, "MSI GF75 2060 RTX",7555, 8));
			produitdao.save(new Product(null, "Samsung A10", 556, 25));
			produitdao.findAll().forEach(p->{
				System.out.println(p.getName()+" "+p.getQte());
			});
		};
		
	}

}
