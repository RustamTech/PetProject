package Calculator.src;

import java.util.Scanner;

public class MethodCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = performOperation(num1, num2, operator);
        System.out.println("Результат: " + result);
    }

    public static double performOperation(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    return Double.NaN;
                }
            default:
                System.out.println("Ошибка: неизвестный оператор.");
                return Double.NaN;
        }
    }
}

