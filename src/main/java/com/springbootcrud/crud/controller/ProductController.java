package com.springbootcrud.crud.controller;


import com.springbootcrud.crud.entity.Product;
import com.springbootcrud.crud.service.DeleteProduct;
import com.springbootcrud.crud.service.GetProducts;
import com.springbootcrud.crud.service.SaveProducts;
import com.springbootcrud.crud.service.UpdateProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private SaveProducts saveservice;

    @Autowired
    private GetProducts getservice;

    @Autowired
    private UpdateProduct updateservice;

    @Autowired
    private DeleteProduct deleteservice;

    @PostMapping("/crud/addProduct")
    public Product addProduct(@RequestBody Product product){
        return saveservice.saveProduct(product);
    }

    @PostMapping("/crud/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> product){
        return saveservice.saveProducts(product);
    }

    @GetMapping("/crud/products")
    public List<Product> findAllProducts(){
        return getservice.getProduct();
    }

    @GetMapping("/crud/products/{id}")
    public Product findProductById(@PathVariable int id){
        return getservice.getProductById(id);
    }

    @GetMapping("/crud/products/{name}")
    public Product findProductByName(@PathVariable String name){
        return getservice.getProductByName(name);
    }

    @PutMapping("/crud/update")
    public Product updateProduct(@RequestBody Product product){
        return updateservice.updateProduct(product);
    }

    @DeleteMapping("/crud/delete/{id}")
    public String deleteProductById(@PathVariable int id){
        return deleteservice.deleteProduct(id);
    }

}
