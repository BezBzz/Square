package ru.netology.sqr;

public class SQRService {
    public int sqrCeil(int under, int over) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (under <= sqr && sqr <= over) {
                count++;
            }
        }
        return count;
    }
}