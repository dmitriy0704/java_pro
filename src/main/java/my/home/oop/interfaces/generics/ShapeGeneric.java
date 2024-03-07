package my.home.oop.interfaces.generics;

import my.home.oop.interfaces.AbstractShape;

public interface ShapeGeneric<T extends AbstractShape> {
    double computeSquare(T shape);

    double computePerimeter(T shape);
}
