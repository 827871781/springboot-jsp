package com.test.springbootjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SpringbootJspApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootJspApplication.class);
    }
    ///////////////////
    public static void main(String[] args) {
        SpringApplication.run(SpringbootJspApplication.class, args);
    }

}
