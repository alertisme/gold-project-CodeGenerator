package com.company.project.dao;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.provider.SpecialProvider;

import java.util.List;

/**
 * @Author guoyang
 * @Date 2017/8/29
 * @Time 13:00
 */

public interface InsertUidListMapper<T> {
    @Options(useGeneratedKeys = true, keyProperty = "docid")
    @InsertProvider(type = SpecialProvider.class, method = "dynamicSQL")
    int insertListss(List<T> recordList);
}
