package dev.phatbeau.watchstore.services.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.phatbeau.watchstore.exceptions.NoProductFoundException;
import dev.phatbeau.watchstore.models.Product.Product;
import dev.phatbeau.watchstore.repositories.Product.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(Integer id) {
        try {
            return productRepo.findById(id);
        } catch (Exception exc) {
            throw new NoProductFoundException("No product found");
        }
    }
}
