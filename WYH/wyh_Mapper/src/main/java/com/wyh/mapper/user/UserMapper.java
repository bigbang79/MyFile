package com.wyh.mapper.user;

import com.wyh.domain.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
    @Insert("insert into t_user (username, password, phone, flag, createdate)values ( #{username}, #{password},  #{phone}, #{flag}, #{createdate})")
    int insert(User user);
}
