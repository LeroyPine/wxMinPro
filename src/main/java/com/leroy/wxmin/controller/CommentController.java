package com.leroy.wxmin.controller;
import com.leroy.wxmin.dao.CommentMapper;
import com.leroy.wxmin.model.Comment;
import com.leroy.wxmin.service.CommentService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import javax.annotation.Resource;
import java.awt.*;
import java.util.Date;
import java.util.List;

/**
* Created by leroy on 2019-03-27.
*/
@RestController
@RequestMapping("/comment")
@Api()
public class CommentController {
    @Resource
    private CommentService commentService;
    @Resource
    private CommentMapper commentMapper;

    @PostMapping("/add")
    public void add(@RequestBody Comment comment){
        comment.setCreateDate(new Date());
        commentMapper.insertSelective(comment);
    }

    @PostMapping("/list")
    @ApiImplicitParam(name = "shopId",value = "店铺Id")
    public List<Comment> detail(Integer shopId) {
        return commentService.list(shopId);
    }


}
