package com.lgz.Mapper;

import com.lgz.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lgz on 2018/7/12.
 */
public interface UserMapper {
    @Select("SELECT * FROM `user`")
    List<User> userList();
}
