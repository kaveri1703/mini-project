package com.example.socialmedia.repository;

import com.example.socialmedia.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
