package com.Eternity.code;
import com.Eternity.code.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       Computer com = context.getBean(Computer.class);
       com.compiling();

       Dev dev = context.getBean(Dev.class);
       dev.coding();

    }
}
