package ru.netology.javaqa.javaqamvn.services.sqr;
public class SQRService {
    public int TestNumber(int min, int max) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= min && x <= max) {
                number++;
            }
        }
        return number;
    }
}
