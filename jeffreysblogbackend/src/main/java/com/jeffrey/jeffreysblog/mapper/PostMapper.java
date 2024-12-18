package com.jeffrey.jeffreysblog.mapper;


import com.jeffrey.jeffreysblog.common.Result;
import com.jeffrey.jeffreysblog.entity.Post;
import org.apache.ibatis.annotations.*;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostMapper {

    Boolean addPost(@Param("post") Post post);

    Boolean deletePost(String postId);

    Boolean updatePost(@Param("post") Post post);

    Post getPostById(@NonNull String postId);

    List<Post> getRangePosts(Integer beginIndex, Integer count);

    List<Post> getAllPosts();

    Integer getLength();

}
