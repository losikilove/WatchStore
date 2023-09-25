package dev.phatbeau.watchstore.services.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.phatbeau.watchstore.exceptions.NoProductFoundException;
import dev.phatbeau.watchstore.models.Product.Product;
import dev.phatbeau.watchstore.repositories.Product.ProductRepo;

@Component
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).orElseThrow(() -> new NoProductFoundException("No product found"));
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepo.findAllByBrand(brand);
    }
}
