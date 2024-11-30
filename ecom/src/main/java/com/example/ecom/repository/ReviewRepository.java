package com.example.ecom.repository;

import com.example.ecom.entity.FAQ;
import com.example.ecom.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findAllByProductId(Long productsId);
}
