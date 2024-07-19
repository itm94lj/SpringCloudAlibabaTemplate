package org.itm94lj.template.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 */
@Configuration
@MapperScan("org.itm94lj.template.mapper")
public class MyBatisConfig {
}
