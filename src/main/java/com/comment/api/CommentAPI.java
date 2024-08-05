package com.comment.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bhargodev on 05/08/24
 **/

@RestController
@RequestMapping("/com/comment")
public class CommentAPI {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.DELETE}, path = "hello")
    public String hello() {
        return "Hello from comment app";
    }
}
