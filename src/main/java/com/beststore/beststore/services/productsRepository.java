package com.beststore.beststore.services;

import com.beststore.beststore.models.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productsRepository extends JpaRepository<product,Integer> {
}
