package ru.netology.sqr;

public class SQRService {
    public int square (int lowerSquare, int upperSquare) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerSquare && i * i <= upperSquare ) {
                count = count + 1;

                }
            }
            return count;
        }
    }

