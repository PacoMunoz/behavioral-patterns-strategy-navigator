package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NavigatorTest {

    @InjectMocks
    private Navigator navigator;

    @Mock
    private RouteCalculator routeCalculator;

    @Test
    void should_calculate_route() {
        Assertions.assertDoesNotThrow(() -> navigator.calculateRoute(12D, 15D));
    }

}