package ru.netology.conditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditional.DevProfile;
import ru.netology.conditional.ProductionProfile;
import ru.netology.conditional.SystemProfile;

@Configuration
public class JavaConfig {
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true", matchIfMissing = true)
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}