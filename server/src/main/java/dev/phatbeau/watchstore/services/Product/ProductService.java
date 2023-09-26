package dev.phatbeau.watchstore.services.Product;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.phatbeau.watchstore.dto.Product.ProductDto;
import dev.phatbeau.watchstore.models.Product.Product;

@Service
public interface ProductService {
    public List<ProductDto> getProducts();
    public ProductDto getProductById(Integer id);
    public List<Product> getProductsByBrand(String brand);
}
