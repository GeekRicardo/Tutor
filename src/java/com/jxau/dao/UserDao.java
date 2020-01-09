package com.jxau.dao;


import com.jxau.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //通过指定的条件获取所有的用户
//    @Select("<script>" +
//            "select * from user where 1=1 " +
//            "<if test=\"username!=null\">and username=#{username}</if>" +
//            "</script>")
    @Select("select * from user")
    List<User> getALLUser();
}
