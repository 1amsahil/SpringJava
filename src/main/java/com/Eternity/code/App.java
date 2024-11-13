package com.Eternity.code;
import com.Eternity.code.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       Desktop desk1 = context.getBean("com",Desktop.class);
       desk1.compiling();

        Desktop desk2 = context.getBean("com",Desktop.class);
        desk2.compiling();

    }
}
