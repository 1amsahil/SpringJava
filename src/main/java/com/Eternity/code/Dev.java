package com.Eternity.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Value("26") // Add value in Age
    private int age ;

    @Autowired
    @Qualifier("lap")
    private Computer com ;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void coding()
    {
        System.out.println("\nCoding");
        com.compiling();
    }
}
