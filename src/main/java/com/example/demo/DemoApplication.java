package com.example.demo;

import com.example.demo.config.expression.dialect.YuansujuAttributeDialect;
import com.example.demo.config.expression.dialect.YuansujuObjectDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
    public YuansujuAttributeDialect yuansujuMoneyDialect(){
        return new YuansujuAttributeDialect();
    }

    @Bean
    @ConditionalOnMissingBean
    public YuansujuObjectDialect wlfDialect() {
        return new YuansujuObjectDialect();
    }
}
