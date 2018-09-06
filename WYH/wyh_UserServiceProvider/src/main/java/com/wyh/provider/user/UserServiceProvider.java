package com.wyh.provider.user;

import com.wyh.common.result.R;
import com.wyh.common.util.ResultUtil;
import com.wyh.domain.User;
import com.wyh.mapper.user.UserMapper;
import com.wyh.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceProvider implements UserService {
    @Autowired
    private UserMapper mapper;
    @Override
    public R save(User user) {
        return ResultUtil.createResult(mapper.insert(user));
    }
}
