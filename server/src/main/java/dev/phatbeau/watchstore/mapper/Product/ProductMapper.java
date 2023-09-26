package dev.phatbeau.watchstore.mapper.Product;

import java.util.List;

import dev.phatbeau.watchstore.dto.Product.ProductDto;
import dev.phatbeau.watchstore.models.Product.Product;

public class ProductMapper {
    public static ProductDto toUserDto(Product product, List<String> images) {
        ProductDto tmp = new ProductDto();

        tmp.setBrand_name(product.getBrand_name());
        tmp.setChain(product.getChain());
        tmp.setCurrent_price(product.getCurrent_price());
        tmp.setDial(product.getDial());
        tmp.setFace_material(product.getFace_material());
        tmp.setFace_shape(product.getFace_shape());
        tmp.setFor_object(product.getFor_object());
        tmp.setHas_left(product.getHas_left());
        tmp.setId(product.getId());
        tmp.setImages(images);
        tmp.setMachine(product.getMachine());
        tmp.setTitle(product.getTitle());
        
        return tmp;
    }
}
