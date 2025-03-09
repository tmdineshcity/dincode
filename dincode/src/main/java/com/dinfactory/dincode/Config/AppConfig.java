package com.dinfactory.dincode.Config;

import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper createModelMapper(){
        return new ModelMapper();
    }

    @Bean
    public PhysicalNamingStrategy physicalNamingStrategy(){
        return new PhysicalNamingStrategyStandardImpl();
    }

    @Bean
    public ImplicitNamingStrategy implicitNamingStrategy(){
        return new ImplicitNamingStrategyLegacyJpaImpl();
    }
}
