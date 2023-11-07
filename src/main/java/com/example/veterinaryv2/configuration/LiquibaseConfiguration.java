package com.example.veterinaryv2.configuration;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class LiquibaseConfiguration {
    @Bean
    public SpringLiquibase liquibaseXml(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db/changelog/changelog_drop_test_table.xml");
        liquibase.setDataSource(dataSource);
        return liquibase;
    }
}
