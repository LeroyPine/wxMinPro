package com.leroy.wxmin;

import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Title: Swagger2Config
 * </p>
 * <p>
 * Description:配置接口文档
 * </p>
 * <p>
 * Company: LeSoft
 * </p>
 * 
 * @author wht
 * @date 2018年8月1日
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {





	@ConditionalOnMissingBean
	@Bean
	public Docket createRestApi() {
		List<Parameter> pars = new ArrayList<Parameter>();
		ParameterBuilder authorizationBuild = new ParameterBuilder();
	/*	Parameter authorization = authorizationBuild.name("authorization").description("user标识")
				.modelRef(new ModelRef("string")).parameterType("header").required(true).build();
		pars.add(authorization);*/
		ParameterBuilder tokenBuild = new ParameterBuilder();
		/*Parameter token = tokenBuild.name("token").description("令牌").modelRef(new ModelRef("string"))
				.parameterType("header").required(true).build();
		pars.add(token);*/
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).useDefaultResponseMessages(false).select()
				.apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).paths(PathSelectors.any()).build()
				.globalOperationParameters(pars);// RequestHandlerSelectors.basePackage(swagger.getBasePackage())
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Blog").description("Blog")
				.version("2.9.2").build();
	}
}
