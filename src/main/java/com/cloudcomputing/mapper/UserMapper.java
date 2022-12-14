package com.cloudcomputing.mapper;

import com.cloudcomputing.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author QihangYin
 * @since 2022-11-25
 */

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
