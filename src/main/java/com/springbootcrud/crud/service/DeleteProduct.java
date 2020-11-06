package com.springbootcrud.crud.service;

import com.springbootcrud.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteProduct {

    @Autowired
    private ProductRepository repository;

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product Removed!!" + id;
    }
}
