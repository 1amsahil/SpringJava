package com.Eternity.code;

public class Dev {

    private int age ;
    private Computer com ;

    public Computer getCom()
    {
        return com;
    }
    public void setCom(Computer com)
    {
        this.com = com;
    }

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
