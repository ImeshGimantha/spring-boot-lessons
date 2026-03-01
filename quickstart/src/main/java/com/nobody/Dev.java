package com.nobody;

public class Dev {
    private int age;
    private Laptop laptop;
    private Computer computer;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
        System.out.println("Dev 1 Constructor");
    }

    public void build() {
        System.out.println("Working on awesome project");
        laptop.compile();
    }

    // setter injection
    // this method use for XML configuration
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return this.computer;
    }
}
