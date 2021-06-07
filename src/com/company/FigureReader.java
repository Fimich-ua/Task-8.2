package com.company;

import java.util.Scanner;

public class FigureReader {
    private Scanner scanner;

    public FigureReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Point readPoint () {
        System.out.println("Enter the x:");
        double x = scanner.nextDouble();
        System.out.println("Enter the y:");
        double y = scanner.nextDouble();
        return new Point(x,y);
    }

    public Circle readCircle () {
        System.out.println("Enter the radius:");
        double radius = scanner.nextDouble();
        System.out.println("Enter the center");
        Point center = readPoint();
        return new Circle(center,radius);
    }
}
