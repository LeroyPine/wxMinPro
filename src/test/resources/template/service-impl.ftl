package ${basePackage}.${projectName}.service.impl;

import ${basePackage}.${projectName}.dao.${modelNameUpperCamel}Mapper;
import ${basePackage}.${projectName}.model.${modelNameUpperCamel};
import ${basePackage}.${projectName}.service.${modelNameUpperCamel}Service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ${author} on ${date}.
 */
@Service
@Transactional
public class ${modelNameUpperCamel}ServiceImpl  implements ${modelNameUpperCamel}Service {
    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;
    


}
