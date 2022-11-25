package com.cloudcomputing.service.impl;

import com.cloudcomputing.entity.UserEntity;
import com.cloudcomputing.mapper.UserMapper;
import com.cloudcomputing.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author QihangYin
 * @since 2022-11-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

}
