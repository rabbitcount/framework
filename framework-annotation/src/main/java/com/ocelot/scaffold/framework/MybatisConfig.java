package com.ocelot.scaffold.framework;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = "com.ocelot.scaffold.framework.mapper")
public class MybatisConfig {

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test\"");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        dataSource.setMaxActive(20);
        dataSource.setInitialSize(1);
        dataSource.setMaxWait(60000);
        dataSource.setMinIdle(1);

        dataSource.setTimeBetweenEvictionRunsMillis(3000);
        dataSource.setMinEvictableIdleTimeMillis(300000);

        dataSource.setValidationQuery("select 'x' FROM DUAL");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        // mysql 不支持 poolPreparedStatements;
//        dataSource.setPoolPreparedStatements(true);
//        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);

        // 开启Druid的监控统计功能
        try {
            dataSource.setFilters("stat");
        }catch(SQLException e){
            e.printStackTrace();
            System.exit(-6);
        }

        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setTypeAliasesPackage("org.lanyonm.playground.domain");
        // replace by @MapperScan
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        Resource[] classPathResources;
//        try {
//            classPathResources = resolver.getResources("classpath:mapper/*Mapper.xml");
//            sessionFactory.setMapperLocations(classPathResources);
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.exit(-7);
//        }
//        sessionFactory.setTypeAliasesPackage();
        return sessionFactory;
    }
}
