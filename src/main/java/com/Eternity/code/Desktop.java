package com.Eternity.code;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop()
    {
        System.out.println("\nDesktop Object Created");
    }

    public void compiling()
    {
        System.out.println("Compiling via Desktop");
    }
}
