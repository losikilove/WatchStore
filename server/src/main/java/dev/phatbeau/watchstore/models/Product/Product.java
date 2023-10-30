package dev.phatbeau.watchstore.models.Product;

import java.util.List;

import dev.phatbeau.watchstore.models.LinkImage.LinkImage;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String brand_name;

    private String chain;

    private String face_material;

    private String dial;

    private String face_shape;

    private String machine;

    private String for_object;

    @Min(value = 0, message = "Price of product must be greater than 0")
    private Integer current_price;

    @Min(value = 0, message = "Quantity of products must be greater than 0")
    private Integer has_left;

    @OneToMany(targetEntity = LinkImage.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private List<LinkImage> linkImages;
}
