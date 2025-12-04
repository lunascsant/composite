package com.composite;

public class Circle implements Shape {
    private final String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw(StringBuilder out) {
        out.append("Circle: ").append(name).append("\n");
    }
}

