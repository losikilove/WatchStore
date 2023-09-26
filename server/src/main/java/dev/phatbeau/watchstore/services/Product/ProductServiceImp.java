package dev.phatbeau.watchstore.services.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.phatbeau.watchstore.dto.Product.ProductDto;
import dev.phatbeau.watchstore.exceptions.NoProductFoundException;
import dev.phatbeau.watchstore.mapper.Product.ProductMapper;
import dev.phatbeau.watchstore.models.Product.Product;
import dev.phatbeau.watchstore.repositories.LinkImage.LinkImageRepo;
import dev.phatbeau.watchstore.repositories.Product.ProductRepo;

@Component
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private LinkImageRepo linkImageRepo;

    @Override
    public List<ProductDto> getProducts() {
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = productRepo.findAll();

        for (Product product : products) {
            productDtos.add(ProductMapper.toUserDto(product, linkImageRepo.findImagesByProductId(product.getId())));
        }

        return productDtos;
    }

    @Override
    public ProductDto getProductById(Integer id) {
        Product product = productRepo.findById(id).orElseThrow(() -> new NoProductFoundException("No product found"));
        ProductDto productDto = ProductMapper.toUserDto(product, linkImageRepo.findImagesByProductId(id));

        return productDto;
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return productRepo.findAllByBrand(brand);
    }
}
