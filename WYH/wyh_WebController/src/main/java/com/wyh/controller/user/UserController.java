package com.wyh.controller.user;

import com.wyh.common.result.R;
import com.wyh.domain.User;
import com.wyh.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @Autowired
   private UserService service;
    @PostMapping("usersave.do")
    public R save(User user){
        return service.save(user);
    }
}
