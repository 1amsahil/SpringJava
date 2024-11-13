package com.Eternity.code.config;

import com.Eternity.code.Computer;
import com.Eternity.code.Desktop;
import com.Eternity.code.Dev;

import com.Eternity.code.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//  1.)  @Bean(name = {"desk", "desktop", "com"})   // This name attribute can change the Object name.
//  2.)  @Scope("prototype")     // It created new object for the same class type.

   @Bean
    public Desktop desktop()    // Object name in (App.java) must have the same name as Method (desktop).
    {
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop lap()
    {
        return new Laptop();
    }

    @Bean
    public Dev dev(@Qualifier("desktop") Computer com)  // Bean of Laptop/Desktop is a type of Computer.
    {
        Dev obj = new Dev();
        obj.setAge(24);
        obj.setCom(com);

        return obj;
    }

}
