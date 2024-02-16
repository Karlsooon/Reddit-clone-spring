package com.karakat.spring.RedditClone.repository;

import com.karakat.spring.RedditClone.model.Post;
import com.karakat.spring.RedditClone.model.User;
import com.karakat.spring.RedditClone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
