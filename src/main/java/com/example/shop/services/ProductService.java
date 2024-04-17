package com.example.shop.services;

import com.example.shop.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID,"Iphone 12", "Mobile phone", 45000, "Moscow", "Oleg"));
        products.add(new Product(++ID,"Iphone 11", "Mobile phone", 30000, "Moscow", "Borya"));
    }

    public List<Product> listProducts() {return products;}

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
