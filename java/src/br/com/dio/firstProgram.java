package br.com.dio;

import br.com.dio.model.Cat;


import java.util.Scanner;
import java.util.Scanner;

public class firstProgram {
    public static void main(String[] args) {
        Cat cat = new Cat("Uni", "tricolor", 1);
        System.out.println(cat);

        Book book = new Book("Mindhunter", 360);
        System.out.println(book);
    }
}

class Book {
    private String name;
    private Integer numPages;

    public Book(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", numPages=" + numPages + '}';
    }
}


class calculator {
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
