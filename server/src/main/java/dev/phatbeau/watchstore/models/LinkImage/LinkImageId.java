package dev.phatbeau.watchstore.models.LinkImage;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LinkImageId implements Serializable{
    private Integer product_id;
    private String link_image;
}
