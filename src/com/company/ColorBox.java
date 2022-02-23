package com.company;

class ColorBox extends Box {
    private ColorBox.OptionsColor color;

    public enum OptionsColor {
        RED,
        GREEN,
        BLUE,
        ORANGE,
        YELLOW,
        PURPLE,
        PINK;
    }

    public ColorBox(double width, double height, double depth, OptionsMaterial material, OptionsColor color) {
        super(width, height, depth, material);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "color=" + color +
                ", height=" + height +
                ", depth=" + depth +
                ", width=" + width +
                ", material=" + material +
                '}';
    }

    @Override
    public double count() {
        return super.count();
    }
}