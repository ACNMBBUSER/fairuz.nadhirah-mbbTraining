package com.fairuznadhirah.buystore.services;

import com.fairuznadhirah.buystore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
