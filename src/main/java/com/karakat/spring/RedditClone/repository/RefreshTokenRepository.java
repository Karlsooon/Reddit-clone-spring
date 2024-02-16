package com.karakat.spring.RedditClone.repository;

import com.karakat.spring.RedditClone.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface RefreshTokenRepository extends JpaRepository<RefreshTokenRepository, Long> {
    Optional<RefreshToken> findByToken(String token);
    void deleteByToken(String token);
}
