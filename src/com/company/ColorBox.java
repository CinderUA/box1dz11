package com.company;

class ColorBox extends Box {

    public enum OptionsColor {
        RED,
        GREEN,
        BLUE,
        ORANGE,
        YELLOW,
        PURPLE,
        PINK;
    }

    public ColorBox(double width, double height, double depth, OptionsMaterial material) {
        super(width, height, depth, material);
    }
}