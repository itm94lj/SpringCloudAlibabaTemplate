package org.itm94lj.template;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于产生MBG的代码
 */
public class Generator {
    public static  void main(String[] args) throws Exception {
        //MBG 执行过程中的警告信息
        List<String>             warnings = new ArrayList<String>();
        //当生成的代码重复时，覆盖原代码
        boolean                 overwrite = true;
        InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser            cp = new ConfigurationParser(warnings);
        Configuration              config = cp.parseConfiguration(is);
        DefaultShellCallback     callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

    }
}
