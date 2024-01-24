package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);

        Renderer rectangleRenderer = new Renderer(rectangle);
        rectangleRenderer.draw();

        Renderer circleRenderer = new Renderer(new Circle(2));
        circleRenderer.draw();
    }
}
