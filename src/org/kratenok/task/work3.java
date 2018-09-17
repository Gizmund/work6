package org.kratenok.task;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название валюты :(Евро,Белка,Доллар,Рубль)");
        String money = scan.nextLine();
        switch (money) {
            case "Евро": {
                System.out.println("Курс 16.15");
                break;
            }
            case "Белка": {
                System.out.println("Курс 0.15");
                break;
            }

            case "Доллар": {
                System.out.println("Курс 13.15");
                break;
            }
            case "Рубль": {
                System.out.println("Курс 33.15");
                break;
            }
            default: {
                System.out.println("нет такой валюты");
                break;
            }
        }
    }

}
