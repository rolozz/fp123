package org.kosareva.config;

import org.springframework.beans.factory.annotation.Autowired;

@Configuration
@ComponentScan("org.kosareva")
@EnableWebMvc
public class SpringConfig implements WebMvcConfigurer {
    private final ApplicationContext applicationContext;

    @Autowired
    public SpringConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public SpringResourceTemplateResolver templateResolver() {

    }

    @Bean
    public DataSource dataSource() {

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        WebMvcConfigurer.super.configureViewResolvers(registry);
    }
}
