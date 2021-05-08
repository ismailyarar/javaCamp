package com.spring.northwind.business.abstracts;

import java.util.List;

import com.spring.northwind.entities.concretes.Product;

public interface ProductService {
  List<Product> getAll();
}
