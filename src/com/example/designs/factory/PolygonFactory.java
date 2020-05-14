package com.example.designs.factory;

public class PolygonFactory {

    public Polygon getPolygon(int numberOfSide) {
        if (numberOfSide == 3) {
            return new Triangle();
        }
        if (numberOfSide == 4) {
            return new Square();
        }
        if (numberOfSide == 5) {
            return new Pentagon();
        }
        if (numberOfSide == 7) {
            return new Heptagon();
        } else if (numberOfSide == 8) {
            return new Octagon();
        }
        return null;
    }
}
