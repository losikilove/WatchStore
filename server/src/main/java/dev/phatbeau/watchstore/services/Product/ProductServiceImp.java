package dev.phatbeau.watchstore.services.Product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.phatbeau.watchstore.dto.Product.ProductDto;
import dev.phatbeau.watchstore.exceptions.ExistedProductException;
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
    public List<Product> getProducts() {
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = productRepo.findAll();

        for (Product product : products) {
            productDtos.add(ProductMapper.toUserDto(product, linkImageRepo.findImagesByProductId(product.getId())));
        }

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

    @Override
    public Product addProduct(Product product) {
        if (productRepo.findIdByTitle(product.getTitle()) != null) {
            throw new ExistedProductException("Product is already existing");
        }

        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product, Integer id) {
        Product currentProduct = productRepo.findById(id).orElseThrow(() -> new NoProductFoundException("No product found"));

        if (product.getBrand_name() != null) {
            currentProduct.setBrand_name(product.getBrand_name());
        }

        if (product.getChain() != null) {
            currentProduct.setChain(product.getChain());
        }

        if (product.getCurrent_price() != null) {
            currentProduct.setCurrent_price(product.getCurrent_price());
        }

        if (product.getDial() != null) {
            currentProduct.setDial(product.getDial());
        }
        
        if (product.getFace_material() != null) {
            currentProduct.setFace_material(product.getFace_material());
        }
        
        if (product.getFace_shape() != null) {
            currentProduct.setFace_shape(product.getFace_shape());
        }
        
        if (product.getFor_object() != null) {
            currentProduct.setFor_object(product.getFor_object());
        }

        if (product.getHas_left() != null) {
            currentProduct.setHas_left(product.getHas_left());
        }
        
        if (product.getMachine() != null) {
            currentProduct.setMachine(product.getMachine());
        }

        if (product.getTitle() != null) {
            if (!product.getTitle().equals(currentProduct.getTitle()) && productRepo.findIdByTitle(product.getTitle()) != null) {
                throw new ExistedProductException("Product is existing");
            } else {
                currentProduct.setTitle(product.getTitle());
            }
        }

        if (product.getLinkImages() != null && !product.getLinkImages().isEmpty()) {
            currentProduct.setLinkImages(product.getLinkImages());
        }

        return productRepo.save(currentProduct);
    }
}
