package com.company.project.service.impl;

import com.company.project.dao.TFx168NewsMapper;
import com.company.project.model.TFx168News;
import com.company.project.service.Fx168NewsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ISME on 2017/08/31.
 */
@Service
@Transactional
public class Fx168NewsServiceImpl extends AbstractService<TFx168News> implements Fx168NewsService {
    @Resource
    private TFx168NewsMapper tFx168NewsMapper;

}
