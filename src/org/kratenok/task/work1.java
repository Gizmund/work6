package org.kratenok.task;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону куба:");
        int a = scan.nextInt();
        System.out.println("объем равен" + a*a*a);
        System.out.println("Плащадь боковой поверхности равна:" +a*a);



    }
}
