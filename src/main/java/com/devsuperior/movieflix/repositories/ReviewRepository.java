package com.devsuperior.movieflix.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;

public interface ReviewRepository extends JpaRepository<Review, Long> {
	Page<Review> findByUser(User user, Pageable pageable);
}
