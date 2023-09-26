package dev.phatbeau.watchstore.dto.Product;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
    private Integer id;

    private String title;

    private String brand_name;

    private String chain;

    private String face_material;

    private String dial;

    private String face_shape;

    private String machine;

    private String for_object;

    private Integer current_price;

    private Integer has_left;

    private List<String> images;
}
