package org.kratenok.task;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите трех значное число");
        int a = scan.nextInt();
        int first = a/100;
        int second = (a - first*100)/10;
        int third = a - first*100 - second*10;
        System.out.println("сумма цифр :"+(first + second + third ));


    }

}


