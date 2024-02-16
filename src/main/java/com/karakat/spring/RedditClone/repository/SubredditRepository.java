package com.karakat.spring.RedditClone.repository;

import com.karakat.spring.RedditClone.model.Subreddit;
import com.karakat.spring.RedditClone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(Subreddit subredditName);

}
