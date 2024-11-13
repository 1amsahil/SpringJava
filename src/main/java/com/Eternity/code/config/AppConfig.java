package com.Eternity.code.config;

import com.Eternity.code.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Desktop desktop()    // Object name in (App.java) must have the same name as Method (desktop)
    {
        return new Desktop();
    }

}
