package com.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape {
    private final String name;
    private final List<Shape> children = new ArrayList<>();

    public CompositeShape(String name) {
        this.name = name;
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public void remove(Shape shape) {
        children.remove(shape);
    }

    @Override
    public void draw(StringBuilder out) {
        out.append("Composite: ").append(name).append("\n");
        for (Shape child : children) {
            child.draw(out);
        }
    }
}

