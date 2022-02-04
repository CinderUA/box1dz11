package com.company;

class Box {
    private double height = 10;
    private double depth = 10;
    private double width = 10;
    private String color = "Red";
    private String material = "Cardboard";

    public double count() {
        return width * height * depth;
    }
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(double width, double height, double depth, String color, String material) {
        this(width, height, depth);
        this.color = color;
        this.material = material;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        if (height > 0) {
            this.height = height;
        } else{
            System.out.println("Attention! Number cannot be negative or equal to 0! So we return the previous value:");
        }
    }
    public double getDepth(){
        return depth;
    }
    public void setDepth(double depth){
        if (depth > 0) {
            this.depth = depth;
        } else{
            System.out.println("Attention! Number cannot be negative or equal to 0! So we return the previous value:");
        }
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        if (width > 0) {
            this.width = width;
        } else{
            System.out.println("Attention! Number cannot be negative or equal to 0! So we return the previous value:");
        }
    }
    public String getColor(){
        return color;
    }
    public String getMaterial(){
        return material;
    }
}