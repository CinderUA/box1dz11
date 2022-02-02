package com.company;

public class Main {

    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        Box myBox3 = new Box();
        Box myBox4 = new Box();
        Box myBox5 = new Box();

        myBox1.personalization(10, 20, 15);
        myBox2.personalization(6, 3, 3);
        myBox3.personalization(12, 7, 15);
        myBox4.personalization(12, 6, 18);
        myBox5.personalization(10, 2, 15);

        System.out.println("Объем 1й коробки: " + myBox1.count());
        System.out.println("Объем 2й коробки: " + myBox2.count());
        System.out.println("Объем 3й коробки: " + myBox3.count());
        System.out.println("Объем 4й коробки: " + myBox4.count());
        System.out.println("Объем 5й коробки: " + myBox5.count());
    }
}