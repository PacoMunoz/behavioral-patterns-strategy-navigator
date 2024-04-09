package org.example;

public class RouteCalculatorByFoot implements RouteCalculator{
    @Override
    public void calculateRoute(Double x, Double y) {
        System.out.printf("Calculating route by foot between %f y %f %n", x, y);
    }
}
