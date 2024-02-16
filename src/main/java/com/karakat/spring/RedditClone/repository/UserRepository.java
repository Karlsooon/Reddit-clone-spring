package com.karakat.spring.RedditClone.repository;

import com.karakat.spring.RedditClone.model.Subreddit;
import com.karakat.spring.RedditClone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
