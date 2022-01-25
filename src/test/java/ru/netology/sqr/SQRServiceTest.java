package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTestSquare {

    @Test
    void testDefaultLowerAndUpperSquare() {
        SQRService service = new SQRService();
        int count = 0;
        int lowerSquare = 100;
        int upperSquare = 1000;
        int resultSQRService = 22;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerSquare && i * i <= upperSquare) {
                count = count + 1;
                long actual = service.square(lowerSquare, upperSquare);
                assertEquals(resultSQRService, actual);
            }
        }
    }

    @Test
    void testWhenSquareBig() {
        SQRService service = new SQRService();
        int count = 0;
        int lowerSquare = 100;
        int upperSquare = 10001;
        int resultSQRService = 90;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerSquare&& i * i <= upperSquare) {
                count = count + 1;
                long actual = service.square(lowerSquare, upperSquare);
                assertEquals(resultSQRService, actual);
            }
        }
    }
}