package org.itm94lj.template.demo.config;


import org.itm94lj.template.common.config.BaseSwaggerConfig;
import org.itm94lj.template.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig  extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("org.itm94lj.template.demo")
                .title("template 示例系统")
                .description("template 示例相关接口文档")
                .contactName("itm94lj")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}
