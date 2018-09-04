package com.wyh.mapper.user;

import com.wyh.domain.UserRec;
import org.apache.ibatis.annotations.Insert;

public interface UserRecMapper {
    @Insert("insert into t_userrec ( recuid, berecuid, createtime) values ( #{recuid}, #{berecuid}, #{createtime}")
    int insert(UserRec record);
}
