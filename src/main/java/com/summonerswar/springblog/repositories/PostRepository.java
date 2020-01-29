package com.summonerswar.springblog.repositories;

import com.summonerswar.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
