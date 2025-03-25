package edu.czjtu.demo4.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.czjtu.demo4.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
} 