package com.Eternity.code;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop()
    {
        System.out.println("\nLaptop Object Created");
    }

    public void compiling()
    {
        System.out.println("Compiling via Laptop");
    }
}
