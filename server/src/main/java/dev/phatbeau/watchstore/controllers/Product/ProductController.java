package dev.phatbeau.watchstore.controllers.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.phatbeau.watchstore.models.Product.Product;
import dev.phatbeau.watchstore.services.Product.ProductService;

@RestController
@RequestMapping("api/product/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<List<Product>>(productService.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        return new ResponseEntity<Product>(productService.getProductById(Integer.parseInt(id)), HttpStatus.OK);  
    }

    @GetMapping("/all/{brand}")
    public ResponseEntity<List<Product>> getProductsByBrand(@PathVariable String brand) {
        return new ResponseEntity<List<Product>>(productService.getProductsByBrand(brand), HttpStatus.OK);
    }
}
