package com.company.project.service.impl;

import com.company.project.dao.TFx168NewsTagRefMapper;
import com.company.project.model.TFx168NewsTagRef;
import com.company.project.service.Fx168NewsTagRefService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ISME on 2017/08/31.
 */
@Service
@Transactional
public class Fx168NewsTagRefServiceImpl extends AbstractService<TFx168NewsTagRef> implements Fx168NewsTagRefService {
    @Resource
    private TFx168NewsTagRefMapper tFx168NewsTagRefMapper;

}
