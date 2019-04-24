package com.leroy.wxmin.service;
import com.leroy.wxmin.model.Comment;

import java.util.List;


/**
 * Created by leroy on 2019-03-27.
 */
public interface CommentService  {

    List<Comment> list(Integer shopId);
}
