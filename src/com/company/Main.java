package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String os;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число = ");
            double num = scanner.nextInt();

            System.out.println("Введите второе число = ");
            double num2 = scanner.nextInt();

            System.out.println("Введите * / - +  ");
            String name = scanner.next();

            if (name.equals("*")) {
                System.out.println("Результат = " + (num * num2));
                System.out.println("Хотите продолжить y/n");
                os = scanner.next();

            } else if (name.equals("+")) {
                System.out.println("Результат = " + (num + num2));
                System.out.println("Хотите продолжить y/n");
                os = scanner.next();

            } else if (name.equals("-")) {
                System.out.println("Результат = " + (num - num2));
                System.out.println("Хотите продолжить y/n");
                os = scanner.next();

            } else if (name.equals("/")) {
                System.out.println("Результат = " + (num / num2));
                System.out.println("Хотите продолжить y/n");
                os = scanner.next();

            } else {
                System.out.println("Вы неправильно вели знаков");
                return;
            }

        }while (os.equals("y")) ;

        System.out.println("Пока");
    }
    }

