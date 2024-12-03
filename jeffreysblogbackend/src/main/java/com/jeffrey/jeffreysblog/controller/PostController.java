package com.jeffrey.jeffreysblog.controller;

import com.jeffrey.jeffreysblog.common.Result;
import com.jeffrey.jeffreysblog.entity.Post;
import com.jeffrey.jeffreysblog.service.PostService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@Slf4j
public class PostController {
    @Resource
    public PostService postService;

    @PostMapping(value = "/addpost")
    public Result addPost(@RequestBody Post post) {
       return postService.addPost(post);
    }

    @PostMapping("/deletepost")
    public Result deletePost(@RequestParam(value = "postId") String postId) {
        return postService.deletePost(postId);
    }

    @PostMapping("/updatepost")
    public Result updatePost(@RequestBody Post post) {
        return postService.updatePost(post);
    }

    @GetMapping("/getpostbyid")
    public Result getPostById(@RequestParam(value="id") Integer id){
        return postService.getPostById(id);
    }

    @GetMapping("/getrangeposts")
    public Result getRangePosts(@RequestParam(value = "beginPage") Integer beginPage,@RequestParam(value = "count") Integer count) {
        return postService.getRangePosts(beginPage,count);
    }

}
