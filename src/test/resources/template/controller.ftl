package ${basePackage}.${projectName}.controller;
import ${basePackage}.${projectName}.model.${modelNameUpperCamel};
import ${basePackage}.${projectName}.service.${modelNameUpperCamel}Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import javax.annotation.Resource;
import java.util.List;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
* Created by ${author} on ${date}.
*/
@RestController
@RequestMapping("${baseRequestMapping}")
@Api()
public class ${modelNameUpperCamel}Controller {
    @Resource
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @PostMapping("/save")
    @ApiImplicitParams({
			@ApiImplicitParam(value = "authorization", paramType = "header", name = "用户名", required = true),
			@ApiImplicitParam(value = "token", paramType = "header", name = "令牌", required = true)})
    public void save(@Validated ${modelNameUpperCamel} ${modelNameLowerCamel}) {
    	if(${modelNameLowerCamel}.getId() != null)
    		 ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
    	else
        	${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
    }


}
