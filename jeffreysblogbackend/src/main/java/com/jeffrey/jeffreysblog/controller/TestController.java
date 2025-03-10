package com.jeffrey.jeffreysblog.controller;


import com.alibaba.fastjson.JSON;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.jeffrey.jeffreysblog.common.Result;
import com.jeffrey.jeffreysblog.entity.Post;
import com.jeffrey.jeffreysblog.utils.jwtUtils.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

//TestController.java
@CrossOrigin
@Slf4j
@RestController
public class TestController {
    @RequestMapping(value = "/test")
    public Result test(){
        return new Result("200","成功!",null);
    }

//    @PostMapping("/api/posts")
//    public Post createPost(@RequestBody Post post) {
//        post.setCategoryId(post.getCategoryId().toString());
//        post.setCategoryId(JSON.parseArray(post.getCategoryId().toString()));
//        return post;
//    }
//    @PostMapping(value = "/testtoken")
//    public Result testToken(@RequestParam("token") String token){
//        log.info("当前token为：[{}]",token);
//        try{
//            DecodedJWT verify = JWTUtils.verify(token);
//
//            // verify.getClaim("name").asString();
//
//            return new Result("200","成功!",verify);
//        }
//        catch (SignatureVerificationException e){
//            return Result.error("无效签名!");
//        }
//        catch(TokenExpiredException e){
//            return Result.error("登录过期,请重新登录!");
//        }
//        catch (AlgorithmMismatchException e){
//            return Result.error("算法不一致!");
//        }
//    }
}
