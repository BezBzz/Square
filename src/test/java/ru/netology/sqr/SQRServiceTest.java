package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SQRServiceTest {

    @Test
    void shouldInTargetValues() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqrCeil(200, 300);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldMinTargetValues() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.sqrCeil(0, 100);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldMaxTargetValues() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.sqrCeil(9801, 9802);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldOverTargetValues() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrCeil(9802, 10000);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldUnderTargetValues() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrCeil(0, 98);
        Assertions.assertEquals(expected, actual);
    }
}