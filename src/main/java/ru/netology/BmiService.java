package ru.netology;

public class BmiService {
    public int calculate(int mass, double height) {

        return (int)(mass / (height * height));

    }
}
