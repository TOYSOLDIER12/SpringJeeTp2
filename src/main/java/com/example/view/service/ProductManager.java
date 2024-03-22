package com.example.view.service;

import com.example.view.dao.Entity.Product;
import java.util.List;

public interface ProductManager {
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public boolean deleteProduct(Product product);
    public List<Product> getAllProducts();
}