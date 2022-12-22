package com.cloudcomputing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloudcomputing.entity.PlayerEntity;
import com.cloudcomputing.entity.RecordEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Qihang Yin
 * @since 2022-11-26
 */

@Mapper
public interface PlayerMapper extends BaseMapper<PlayerEntity> {
}
