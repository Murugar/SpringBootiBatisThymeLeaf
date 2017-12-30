package com.iqmsoft.Mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.iqmsoft.Post;

@Mapper
public interface PostMapper {

    @Select("SELECT POST_TEXT FROM POST WHERE ID=#{ID}")
    String findTextById(@Param("ID") int id);

}
