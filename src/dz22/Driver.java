package dz22;

import dz22.driving_experience;

import java.util.Scanner;

public class Driver {
    public static void main (String[] args) {
        driving_experience driver = new driving_experience();
        driver.driexp = 2;
        driver.category = "B";
        driver.carplace = 5;
        driver.tank = 25;
        System.out.println("Стаж вождения: " +driver.driexp);
        System.out.println("Категория вождения: " +driver.category);

        Scanner bscan = new Scanner(System.in);
        System.out.print("Выберите ключи: ");
        int keyss = bscan.nextInt();
        // 0 - ключи от bmw e34
        // 1 - ключи от ford sierra
        // 2 - ключи от bmw e36
        if (keyss == 0) {
            System.out.println("Выбраны ключи от bmw e34");
        } else if (keyss == 1) {
            System.out.println("Выбраны ключи от ford sierra");
        } else if (keyss == 2) {
            System.out.println("Выбраны ключи от bmw e36");
        } else if (keyss <= 3) {
            System.out.println("Выбраны неверные ключи");
            return;
        }

        if(driver.category == "B") {
            System.out.println("Категория прав подходит");
        }
        else if (driver.category != "B") {
            System.out.println("Категория прав не подходит");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество пассажиров: ");
        int seats = scanner.nextInt();
        if(seats >= driver.carplace) {
            System.out.println("Количество пассажиров не подходит");
            return;
        }
        else if (seats <= driver.carplace ) {
        }
        System.out.println("Кол-во топлива: " +driver.tank +" литров");

        Scanner s = new Scanner(System.in);
        System.out.print("Хотите заправить авто?: ");
//        1 - да
//        2 - нет
        int fuel = scanner.nextInt();
        if(fuel == 1) {
            System.out.println("Введите количество топлива которое хотите залить: ");
        }
        else if (fuel == 2 ) {
            return;
        }
        Scanner d = new Scanner(System.in);
        int howfuel = scanner.nextInt();
        int how = Integer.parseInt(String.valueOf(driver.tank));
        int result = howfuel + how;
            System.out.println("Теперь количество топлива равно: " +result);
        }
    }
