package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Navigator navigator = new Navigator();
        navigator.setRouteCalculator(new RouteCalculatorByCar());

        navigator.calculateRoute(12D, 15D);

        Navigator navigator1 = new Navigator();
        navigator1.setRouteCalculator(new RouteCalculatorByFoot());
        navigator1.calculateRoute(12D, 15D);

    }
}
