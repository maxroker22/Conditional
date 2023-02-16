package ru.netology.conditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.conditional.DevProfile;
import ru.netology.conditional.ProductionProfile;
import ru.netology.conditional.SystemProfile;
@ConditionalOnProperty(value = "netology.profile.dev", matchIfMissing = true)
@Configuration
public class JavaConfig {
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}