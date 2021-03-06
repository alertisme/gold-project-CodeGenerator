package com.company.project.core;

/**
 * 项目常量
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "com.dimeng.platform.controller.shop";//项目基础包名称，根据自己公司的项目修改

    public static final String MODEL_PACKAGE = BASE_PACKAGE + "com.dimeng.platform.model";//Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + "com.dimeng.platform.dao";//Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".com.dimeng.platform.service.shop";//Service所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".com.dimeng.platform.service.shop.impl";//ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".com.dimeng.platform.controller.shop";//Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.Mapper";//Mapper插件基础接口的完全限定名
}
