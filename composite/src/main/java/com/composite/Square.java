package com.composite;

public class Square implements Shape {
    private final String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public void draw(StringBuilder out) {
        out.append("Square: ").append(name).append("\n");
    }
}

