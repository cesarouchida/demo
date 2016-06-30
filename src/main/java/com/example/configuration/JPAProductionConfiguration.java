package com.example.configuration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@Configuration
@Profile("prod")
public class JPAProductionConfiguration {

    @Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

        System.out.println(username);
        System.out.println(password);
        System.out.println(dbUrl);

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        return basicDataSource;
    }

//    @Autowired
//    private Environment environment;
//
//    @Bean
//    public DataSource dataSource() throws URISyntaxException {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//
//        URI dbUrl = new URI(environment.getProperty("dcg33dmvcn7p1a"));
//        dataSource.setUrl("jdbc:postgresql://" +
//                            dbUrl.getHost() +  ":" +
//                            dbUrl.getPort() +
//                            dbUrl.getPath()
//                        );
//
//        dataSource.setUsername(dbUrl.getUserInfo().split(":")[0]);
//        dataSource.setPassword(dbUrl.getUserInfo().split(":")[1]);
//        return dataSource;
//    }
//
//    @Bean
//    @Profile("prod")
//    public DataSource postgresDataSource() throws URISyntaxException{
//        String databaseUrl = System.getenv("DATABASE_URL");
//
//        URI dbUri = new URI(databaseUrl);
//
//        String username = dbUri.getUserInfo().split(":")[0];
//        String password = dbUri.getUserInfo().split(":")[1];
//        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':'
//                + dbUri.getPort() + dbUri.getPath();
//
//        org.apache.tomcat.jdbc.pool.DataSource dataSource
//                = new org.apache.tomcat.jdbc.pool.DataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl(dbUrl);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        dataSource.setTestOnBorrow(true);
//        dataSource.setTestWhileIdle(true);
//        dataSource.setTestOnReturn(true);
//        dataSource.setValidationQuery("SELECT 1");
//        return dataSource;
//    }

}
