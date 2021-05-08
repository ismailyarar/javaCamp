package com.spring.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
