package com.soccer.authority.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soccer.authority.entity.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

	List<Authority> findAllById(Long authorityId);
}
