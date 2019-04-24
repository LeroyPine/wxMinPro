package com.leroy.wxmin;

/**
 * 项目常量
 */
public final class ProjectConstant {
	public static final String PROJECT_NAME = "wxmin";// 子项目名称
	public static final String BASE_PACKAGE = "com.leroy";// 项目基础包名称，根据自己公司的项目修改

	public static final String MODEL_PACKAGE = BASE_PACKAGE + "." + PROJECT_NAME + ".model";// Model所在包
	public static final String MAPPER_PACKAGE = BASE_PACKAGE + "." + PROJECT_NAME + ".dao";// Mapper所在包
	public static final String SERVICE_PACKAGE = BASE_PACKAGE + "." + PROJECT_NAME + ".service";// Service所在包
	public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";// ServiceImpl所在包
	public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + "." + PROJECT_NAME + ".controller";// Controller所在包

	public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".dao.Mapper";// Mapper插件基础接口的完全限定名
}
