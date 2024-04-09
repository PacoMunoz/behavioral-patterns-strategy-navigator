package org.example;

public class RouteCalculatorByCar implements RouteCalculator{
    @Override
    public void calculateRoute(Double x, Double y) {
        System.out.printf("Calculating route by car between %f y %f %n", x, y);
    }
}
