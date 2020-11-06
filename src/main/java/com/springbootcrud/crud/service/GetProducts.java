package com.springbootcrud.crud.service;

import com.springbootcrud.crud.entity.Product;
import com.springbootcrud.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProducts {

    @Autowired
    private ProductRepository repository;

    public List<Product> getProduct(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }
}
