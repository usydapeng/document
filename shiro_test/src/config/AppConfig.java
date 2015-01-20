package config;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Lazy
@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableAsync
@EnableScheduling
@ComponentScan(basePackages = "com.dapeng",
		excludeFilters = {@ComponentScan.Filter(Configuration.class), @ComponentScan.Filter(Configuration.class)})
@Import(DataConfig.class)
@PropertySources(@PropertySource("classpath:dapeng_local.properties"))
public class AppConfig {

	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
}
