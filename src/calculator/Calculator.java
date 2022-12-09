package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double s;
        char op;
        Scanner cin = new Scanner(System.in);
        System.out.print("Introduceti 2 numere: ");
        num1 = cin.nextDouble();
        num2 = cin.nextDouble();
        System.out.print("Introduceti operatorul (+, -, *, /, ^): ");
        op = cin.next().charAt(0);
        switch(op) {
            case '+': s = num1 + num2;
                break;
            case '-': s = num1 - num2;
                break;
            case '*': s = num1 * num2;
                break;
            case '/': s = num1 / num2;
                break;
            case '^': s = Math.pow(num1, num2);
                break;
            default:  System.out.print("Eroare! Introduceti corect operatorul");
                return;
        }
        System.out.print("\nRezultatul este:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + s);
    }
}
