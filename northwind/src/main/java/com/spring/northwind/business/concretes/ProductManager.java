package com.spring.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.northwind.business.abstracts.ProductService;
import com.spring.northwind.dataAccess.abstracts.ProductDao;
import com.spring.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	// DI
	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
