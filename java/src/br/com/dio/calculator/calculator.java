package br.com.dio.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = input.nextInt();
        System.out.println("\nDigite o segundo valor: ");
        b = input.nextInt();

        int sum = sum(a, b);
        int sub = sub(a, b);
        int mul = mul(a, b);
        double div = div(a, b);

        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mul);
        System.out.println("Divisão: " + div);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
