package com.cloudcomputing.bussinesscomponent;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cloudcomputing.common.Theme;
import com.cloudcomputing.entity.RecordEntity;

public interface DisplayBc {

    Page<RecordEntity> get(Theme theme, String date, Integer current, Integer size);
}
