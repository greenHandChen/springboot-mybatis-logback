package com.example.demo.config;

import liquibase.integration.spring.SpringLiquibase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by enHui.Chen on 2018/5/14.
 */
@Configuration
public class LiquibaseConfiguration {
    private final Logger log = LoggerFactory.getLogger(LiquibaseConfiguration.class);

    @Bean
    public SpringLiquibase liquibase(DataSource dataSource){
        SpringLiquibase springLiquibase = new SpringLiquibase();
        springLiquibase.setDataSource(dataSource);
        springLiquibase.setChangeLog("classpath:config/liquibase/master.xml");
        springLiquibase.setContexts("liquibase-demo");
        springLiquibase.setDefaultSchema(null);
        springLiquibase.setDropFirst(false);
        springLiquibase.setShouldRun(true);
        log.debug("Configuring liquibase suceess");
        return  springLiquibase;
    }
}
