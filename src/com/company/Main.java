package com.company;

public class Main {

    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15, "Red", " Cardboard");
        Box myBox2 = new Box(5, 7, 15, "Green", " Paper");
        Box myBox3 = new Box(12, 7, 15, "Yellow", " Plastic");
        Box myBox4 = new Box(12, 6, 18, "Pink", " Textile");
        Box myBox5 = new Box(10, 2, 15, "Brown", " Cardboard");

        myBox1.setDepth(20);
        System.out.println(myBox1.getDepth());
        myBox1.setWidth(10);
        System.out.println(myBox1.getWidth());
        myBox1.setHeight(0);
        System.out.println(myBox1.getHeight());
        System.out.println();

        System.out.println("The volume of the 1st box: " + myBox1.count());
        System.out.println("Color and material of the 1st box: " + myBox1.getColor() + myBox1.getMaterial());

        System.out.println("The volume of the 2st box: " + myBox2.count());
        System.out.println("Color and material of the 2st box: " + myBox2.getColor() + myBox2.getMaterial());

        System.out.println("The volume of the 3st box: " + myBox3.count());
        System.out.println("Color and material of the 3st box: " + myBox3.getColor() + myBox3.getMaterial());

        System.out.println("The volume of the 4st box: " + myBox4.count());
        System.out.println("Color and material of the 4st box: " + myBox4.getColor() + myBox4.getMaterial());

        System.out.println("The volume of the 5st box: " + myBox5.count());
        System.out.println("Color and material of the 5st box: " + myBox5.getColor() + myBox5.getMaterial());
    }
}