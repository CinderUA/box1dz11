package com.company;

class Box{

    protected double height = 10;
    protected double depth = 10;
    protected double width = 10;
    protected OptionsMaterial material;

    public double count() {
        return width * height * depth;
    }

    public enum OptionsMaterial {
        CARDBOARD,
        PAPER,
        PLASTIC,
        TEXTILE,
        WOOD;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(double width,double height,double depth,OptionsMaterial material) {
        this(width, height, depth);
        this.material = material;
        if (width <= 0 || height <= 0 || depth <= 0){
            throw new NullPointerException();
        }
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
    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", depth=" + depth +
                ", width=" + width +
                ", material=" + material +
                '}';
    }

}
