package com.service.InventoryService.dao;

import com.service.InventoryService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, String>{
	

}
