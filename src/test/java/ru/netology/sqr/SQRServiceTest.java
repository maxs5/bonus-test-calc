package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test
    public void testLowerAndUpperSquare() {
        SQRService service = new SQRService();
        int count = 0;
        int lowerSquare = 200;
        int upperSquare = 500;
        int resultSQRService = 19;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerSquare && i * i <= upperSquare) {
                count = count + 1;
                long actual = service.square(lowerSquare, upperSquare);
                assertEquals(resultSQRService, actual);
            }
        }

    }
}

    @Test
    public void testwhenSquareRectangle() {
        SQRService service = new SQRService();
        int count = 0;
        int lowerSquare = 100;
        int upperSquare = 900;
        int resultSQRService = 29;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerSquare && i * i <= upperSquare) {
                count = count + 1;
                long actual = service.square(lowerSquare, upperSquare);
                assertEquals(resultSQRService, actual);
            }
        }

    }
}