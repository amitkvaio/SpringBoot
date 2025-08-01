package com.curd.opr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curd.opr.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}