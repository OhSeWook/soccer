package com.soccer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soccer.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByLoginId(String userId);

}
