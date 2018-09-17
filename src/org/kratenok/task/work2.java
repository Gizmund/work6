package org.kratenok.task;

import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите первое число:");
        int a = scan.nextInt();
        System.out.println("Введите второе число:");
        int b = scan.nextInt();
        System.out.println("Чему будет равно произведение чисел: " + a + " и " + b);
        int c = scan.nextInt();
        if (c == a * b) {
            System.out.println("Верно");

        } else {
            System.out.println("Плохо");
        }
    }
}
