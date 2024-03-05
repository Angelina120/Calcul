package ru.krista.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input = in.nextLine();
        String[] parts = input.split("");
        int a,b;
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException exception) {
            System.out.println("Ошибка ввода!");
        }

    }
}
