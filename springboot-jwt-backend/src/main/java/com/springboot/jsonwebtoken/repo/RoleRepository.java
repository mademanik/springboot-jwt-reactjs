package com.springboot.jsonwebtoken.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jsonwebtoken.model.ERole;
import com.springboot.jsonwebtoken.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

	Optional<Role> findByName(ERole name);


}
