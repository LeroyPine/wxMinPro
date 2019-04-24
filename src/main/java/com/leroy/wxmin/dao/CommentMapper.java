package com.leroy.wxmin.dao;

import com.leroy.wxmin.model.Comment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CommentMapper extends Mapper<Comment> {


    @Select("  select  comment.id,repair_shop.id shopId, comment,username,create_date createDate  from comment inner join  repair_shop on   comment.shopId = repair_shop.id " +
            "    where repair_shop.id = #{shopId}")
    List<Comment> selectList(@Param("shopId") Integer shopId);
}