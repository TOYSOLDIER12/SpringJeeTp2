package com.example.view.dao.Repository;

import com.example.view.dao.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Float> {

}
