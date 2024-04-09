package org.example;

public class Navigator {

    private RouteCalculator routeCalculator;

    public void calculateRoute(Double x, Double y) {
        routeCalculator.calculateRoute(x, y);
    }

    public void setRouteCalculator(RouteCalculator routeCalculator) {
        this.routeCalculator = routeCalculator;
    }
}
