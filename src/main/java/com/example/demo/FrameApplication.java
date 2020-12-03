package com.example.demo;

import com.example.demo.config.CrossOriginFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class FrameApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameApplication.class, args);
    }

    @Bean
    public CrossOriginFilter crossOriginFilter(){ return new CrossOriginFilter();
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){ FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
/**
 *设置过滤器
 */ filterRegistrationBean.setFilter(crossOriginFilter());
/**
 *拦截路径
 */ filterRegistrationBean.addUrlPatterns("/api/*");
/**
 *设置名称
 */ filterRegistrationBean.setName("CrossOriginFilter");

        return filterRegistrationBean;
    }


}
