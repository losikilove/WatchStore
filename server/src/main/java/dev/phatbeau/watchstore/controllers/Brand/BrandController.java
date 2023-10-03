package dev.phatbeau.watchstore.controllers.Brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.phatbeau.watchstore.models.Brand.Brand;
import dev.phatbeau.watchstore.repositories.Brand.BrandRepo;

@RestController
@RequestMapping("api/brand/")
@CrossOrigin(origins = "http://localhost:3000")
public class BrandController {
    @Autowired
    private BrandRepo brandRepo;

    @GetMapping("/all")
    List<Brand> getAllBrands() {
        return brandRepo.findAll();
    }
}
