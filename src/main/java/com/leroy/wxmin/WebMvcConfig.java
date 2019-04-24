package com.leroy.wxmin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Value("${file.staticAccessPath}")
	private String staticAccessPath;
	@Value("${file.uploadFolder}")
	private String uploadFolder;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		if(!registry.hasMappingForPattern("/static/**")){
			registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + uploadFolder);
			registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		}
		super.addResourceHandlers(registry);
	}
}
