package com.linkedin.learningspring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.linkedin.learningspring.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
	
}
