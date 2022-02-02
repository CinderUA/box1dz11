package com.company;

class Box {
    double height = 10;
    double depth = 10;
    double width = 10;

    double count() {
        return width * height * depth;
    }
    void personalization(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}