package com.company;

public class Main {

    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(5, 7, 15);
        Box myBox3 = new Box(12, 7, 15);
        Box myBox4 = new Box(12, 6, 18);
        Box myBox5 = new Box(10, 2, 15);

        ColorBox.OptionsColor color1 = ColorBox.OptionsColor.valueOf("RED");
        Box.OptionsMaterial material1 = Box.OptionsMaterial.valueOf("CARDBOARD");
        ColorBox.OptionsColor color2 = ColorBox.OptionsColor.valueOf("GREEN");
        Box.OptionsMaterial material2 = Box.OptionsMaterial.valueOf("PAPER");
        ColorBox.OptionsColor color3 = ColorBox.OptionsColor.valueOf("BLUE");
        Box.OptionsMaterial material3 = Box.OptionsMaterial.valueOf("PLASTIC");
        ColorBox.OptionsColor color4 = ColorBox.OptionsColor.valueOf("ORANGE");
        Box.OptionsMaterial material4 = Box.OptionsMaterial.valueOf("TEXTILE");
        ColorBox.OptionsColor color5 = ColorBox.OptionsColor.valueOf("YELLOW");
        Box.OptionsMaterial material5 = Box.OptionsMaterial.valueOf("WOOD");

        myBox1.setDepth(20);
        System.out.println(myBox1.getDepth());
        myBox1.setWidth(10);
        System.out.println(myBox1.getWidth());
        myBox1.setHeight(0);
        System.out.println(myBox1.getHeight());
        System.out.println();

        System.out.println("The volume of the 1st box: " + myBox1.count());
        System.out.println("Color and material of the 1st box: " + color1 + " " + material1);
        System.out.println("The volume of the 2st box: " + myBox2.count());
        System.out.println("Color and material of the 2st box: " + color2 + " " + material2);
        System.out.println("The volume of the 3st box: " + myBox3.count());
        System.out.println("Color and material of the 3st box: " + color3 + " " + material3);
        System.out.println("The volume of the 4st box: " + myBox4.count());
        System.out.println("Color and material of the 4st box: " + color4 + " " + material4);
        System.out.println("The volume of the 5st box: " + myBox5.count());
        System.out.println("Color and material of the 5st box: " + color5 + " " + material5);
    }
}