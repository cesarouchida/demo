package com.example.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@Profile("prod")
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

//    @Autowired
//    private Environment environment;
//
//    @Bean
//    public DataSource dataSource() throws URISyntaxException {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        URI dbUrl = new URI(environment.getProperty("DATABASE_URL"));
//        dataSource.setUsername(dbUrl.getUserInfo().split(":")[0]);
//        dataSource.setPassword(dbUrl.getUserInfo().split(":")[1]);
//        return dataSource;
//    }
}
