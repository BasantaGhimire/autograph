package com.autograph.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired

    private CommentService commentService;

    @PostMapping

    public Comment saveComment(@RequestBody Comment comment){
        System.out.println("Comment added");
        return commentService.saveComment(comment);
    }
}
