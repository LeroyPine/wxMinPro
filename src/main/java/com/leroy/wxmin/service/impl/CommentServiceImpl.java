package com.leroy.wxmin.service.impl;

import com.leroy.wxmin.dao.CommentMapper;
import com.leroy.wxmin.model.Comment;
import com.leroy.wxmin.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by leroy on 2019-03-27.
 */
@Service
@Transactional
public class CommentServiceImpl  implements CommentService {
    @Resource
    private CommentMapper commentMapper;


    @Override
    public List<Comment> list(Integer shopId) {
        return commentMapper.selectList(shopId);
    }
}
