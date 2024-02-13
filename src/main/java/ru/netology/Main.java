package ru.netology;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98;
        double height = 1.87;
        int index = service.calculate(mass, height); // должно получиться 500
        System.out.println(index);
    }
}