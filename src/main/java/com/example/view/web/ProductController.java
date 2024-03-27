package com.example.view.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.view.dao.Entity.Product;
import com.example.view.service.ProductManager;

import java.util.List;




    @Controller
    public class ProductController {

        @Autowired
        private ProductManager productManager;

        @GetMapping("/search")
        public String GetProductById(Model model, @RequestParam(name = "id") float id){
            Product product = productManager.getProductById(id);
            model.addAttribute("product", product);
            return "search";
        }


        @GetMapping("/listProduit")
        public String getALlProducts(Model model) {
            List<Product> products = productManager.getAllProducts();
            model.addAttribute("listProduit", products);
            return "listProduit" ;
        }

        @GetMapping("/addproduit")
        public String addProduct(Model model) {
            return "addproduit";
        }

        @PostMapping("addproduit")
        public String addproductdb(Model model, @RequestParam(name = "description") String description,
                                   @RequestParam(name = "price") float price) {
            Product product = new Product();
            product.setDesignation(description);
            product.setPrix(price);
            productManager.addProduct(product);
            return "redirect:/listProduit";
        }
    }

