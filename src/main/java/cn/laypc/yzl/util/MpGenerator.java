package cn.laypc.yzl.util;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MpGenerator {



    //注意：开发时只在自己本地代码修改，不要提交、不要提交 不要提交
    //第一步修改 javaSrcDir 修改成自己项目存放java源代码的根路径
    static String javaSrcDir = "D:/java/yzl/src/main/java";

    /**
     * <p>
     * 代码自动生成
     * </p>
     */
    public static void main(String[] args) {

        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(javaSrcDir);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        // .setKotlin(true) 是否生成 kotlin 代码
        gc.setAuthor("YoungE");

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        // gc.setXmlName("%sDao");
        gc.setServiceName("I%sService");
        gc.setServiceImplName("%sServiceImpl");
//         gc.setServiceImplName("%sService");
        // gc.setControllerName("%sAction");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("YoungE4058");
        dsc.setUrl("jdbc:mysql://112.124.22.8:3306/test?useSSL=false");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(); // 需要生成的表
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("cn.laypc.yzl");
        pc.setModuleName(null);
        pc.setMapper("mapper");
        pc.setEntity("entity");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller");
        mpg.setPackageInfo(pc);


        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        tc.setEntity("/templates/vm/entity.java.vm");
        tc.setService("/templates/vm/service.java.vm");
        tc.setServiceImpl("/templates/vm/serviceImpl.java.vm");//设成null才会不生产
        tc.setController("/templates/vm/controller.java.vm");
        tc.setMapper("/templates/vm/mapper.java.vm");
        tc.setXml("/templates/vm/mapper.xml.vm");
        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();
    }

}
