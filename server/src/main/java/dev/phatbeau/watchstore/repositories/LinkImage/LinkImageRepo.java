package dev.phatbeau.watchstore.repositories.LinkImage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dev.phatbeau.watchstore.models.LinkImage.LinkImage;

@Repository
public interface LinkImageRepo extends JpaRepository<LinkImage,LinkImageRepo>{
    @Query(value = "SELECT lm.link_image FROM link_image lm WHERE lm.product_id=:product_id", nativeQuery = true)
    public List<String> findImagesByProductId(@Param("product_id") Integer product_id);
}
