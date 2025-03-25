package edu.czjtu.demo4.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.czjtu.demo4.entity.User;
import edu.czjtu.demo4.mapper.UserMapper;
import edu.czjtu.demo4.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
} 