package com.service.InventoryService.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private double price;
	private int qte ;
}
