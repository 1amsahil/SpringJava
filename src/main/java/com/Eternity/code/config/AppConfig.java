package com.Eternity.code.config;

import com.Eternity.code.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {"desk", "desktop", "com"})   // This name attribute can change the Object name.
    @Scope("prototype")     // It created new object for the same class type.
    public Desktop desktop()    // Object name in (App.java) must have the same name as Method (desktop).
    {
        return new Desktop();
    }

}
