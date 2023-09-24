package dev.phatbeau.watchstore.repositories.Brand;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.phatbeau.watchstore.models.Brand.Brand;

public interface BrandRepo extends JpaRepository<Brand,String>{
    
}
