package com.company.project.service.impl;

import com.company.project.dao.TFx168TagsMapper;
import com.company.project.model.TFx168Tags;
import com.company.project.service.TFx168TagsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/31.
 */
@Service
@Transactional
public class TFx168TagsServiceImpl extends AbstractService<TFx168Tags> implements TFx168TagsService {
    @Resource
    private TFx168TagsMapper tFx168TagsMapper;

}
