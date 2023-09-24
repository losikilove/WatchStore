package dev.phatbeau.watchstore.repositories.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.phatbeau.watchstore.models.Product.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
