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
        return 0;
    }
    scanner.close();
    switch (operation) {
        case "+":{
            return add(n1,n2);
            
        }
        case "-":{
            return sub(n1,n2);
        
        }   
        case "/": {
            return div(n1,n2);
        
        }
        case "*": {
           return mul(n1,n2);
        
        }
        default: {
            return 0;
        }
        
    } 
}
    
}
