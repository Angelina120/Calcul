package ru.krista.example;
import java.util.Scanner;
public class Calculator {
    public int add(int number1, int number2) {
        return number1 + number2;
    }
    public int sub(int number1, int number2) {
        return number1 - number2;
    }
    public int div(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Ошибка: деление на 0!");
            return 0;
        }
        return number1/number2;
    }
    public int mul(int number1, int number2) {
        return number1* number2;
    }
    public int stringe(String[] parts){
        System.out.println("Ввод ");
        int result = 0;
        int n1 = 0, n2 = 0;
        Scanner scanner = new Scanner(System.in);
        String partss = scanner.nextLine();
        String[] partsss = partss.split(" ");
        String operation = partsss[1];
    try {
        n1 = Integer.parseInt(partsss[0]);
        n2 = Integer.parseInt(partsss[2]);
    } catch (NumberFormatException exception) {
        System.out.println("Ошибка ввода!");
    }

    switch (operation) {
        case "+":{
            result = add(n1,n2);
            break;
        }
        case "-":{
            result = sub(n1,n2);
        break;
        }   
        case "/": {
            result = div(n1,n2);
        break;
        }
        case "*": {
            result = mul(n1,n2);
        break;
        }
            
    }
    
    scanner.close();
    return result;
}
    
}
