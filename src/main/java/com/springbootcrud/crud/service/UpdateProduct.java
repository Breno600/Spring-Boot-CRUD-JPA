package com.springbootcrud.crud.service;

import com.springbootcrud.crud.entity.Product;
import com.springbootcrud.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateProduct {

    @Autowired
    private ProductRepository repository;

    public Product updateProduct(Product product){
       Product existingProduct = repository.findById(product.getId()).orElse(null);
       existingProduct.setName(product.getName());
       existingProduct.setPrice(product.getPrice());
       existingProduct.setQuantity(product.getQuantity());
       return repository.save(existingProduct);
    }

}
