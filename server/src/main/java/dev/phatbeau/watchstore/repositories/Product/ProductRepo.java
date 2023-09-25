package dev.phatbeau.watchstore.repositories.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dev.phatbeau.watchstore.models.Product.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "SELECT * FROM product p WHERE p.brand_name=:brand", nativeQuery = true)
    public List<Product> findAllByBrand(@Param("brand") String brand);
}
