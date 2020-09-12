package com.akcap.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akcap.fleetapp.models.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
