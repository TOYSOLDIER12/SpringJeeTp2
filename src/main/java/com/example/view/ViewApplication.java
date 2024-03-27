package com.example.view;

import com.example.view.dao.Entity.Product;
import com.example.view.service.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViewApplication implements CommandLineRunner {
    @Autowired
    private ProductManager productManager;

    public static void main(String[] args) {
        SpringApplication.run(ViewApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(null, "javeel", 1223.0F);
        Product product1 = new Product(null, "dadfd", 1235.0F);
        Product product2 = new Product(null, "3asser", 1823.0F);
        productManager.addProduct(product);
        productManager.addProduct(product1);
        productManager.addProduct(product2);

        System.out.println(productManager.getAllProducts());

    }
}

