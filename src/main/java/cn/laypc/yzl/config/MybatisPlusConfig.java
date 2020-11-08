package cn.laypc.yzl.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus分页查询配置
 * @time: 2020-01-08 15:10
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * 分页查询配置方法
     * @time 2020/1/8 22:17
     * @return
     */
    @Bean
        public PaginationInterceptor paginationInterceptor() {
            PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
            // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
               paginationInterceptor.setOverflow(true);
            // 设置最大单页限制数量，默认 500 条，-1 不受限制
             paginationInterceptor.setLimit(-1);
            return paginationInterceptor;
        }
}