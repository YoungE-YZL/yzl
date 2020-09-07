package cn.laypc.yzl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@MapperScan("cn.laypc.yzl.mapper")
public class YzlApplication {

    public static void main(String[] args) {
        SpringApplication.run(YzlApplication.class, args);
    }

}
