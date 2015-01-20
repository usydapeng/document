package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableJpaRepositories("com.dapeng.repository")
@EnableTransactionManagement
@PropertySources(@PropertySource("classpath:dapeng_local.properties"))
public class DataConfig extends WebMvcConfigurerAdapter {


}
