package com.composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompositeShapeTest {
    @Test
    void testDrawCircle() {
        StringBuilder out = new StringBuilder();
        Shape circle = new Circle("A");
        circle.draw(out);
        assertEquals("Circle: A\n", out.toString());
    }

    @Test
    void testDrawSquare() {
        StringBuilder out = new StringBuilder();
        Shape square = new Square("B");
        square.draw(out);
        assertEquals("Square: B\n", out.toString());
    }

    @Test
    void testCompositeDraw() {
        StringBuilder out = new StringBuilder();
        CompositeShape group = new CompositeShape("Group1");
        group.add(new Circle("A"));
        group.add(new Square("B"));
        group.draw(out);
        assertEquals("Composite: Group1\nCircle: A\nSquare: B\n", out.toString());
    }

    @Test
    void testRemoveShape() {
        StringBuilder out = new StringBuilder();
        CompositeShape group = new CompositeShape("Group2");
        Shape circle = new Circle("A");
        Shape square = new Square("B");
        group.add(circle);
        group.add(square);
        group.remove(circle);
        group.draw(out);
        assertEquals("Composite: Group2\nSquare: B\n", out.toString());
    }

    @Test
    void testNestedComposite() {
        StringBuilder out = new StringBuilder();
        CompositeShape mainGroup = new CompositeShape("Main");
        CompositeShape subGroup = new CompositeShape("Sub");
        subGroup.add(new Circle("A"));
        subGroup.add(new Square("B"));
        mainGroup.add(subGroup);
        mainGroup.add(new Square("C"));
        mainGroup.draw(out);
        assertEquals("Composite: Main\nComposite: Sub\nCircle: A\nSquare: B\nSquare: C\n", out.toString());
    }
}

