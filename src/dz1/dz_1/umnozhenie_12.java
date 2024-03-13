package dz1.dz_1;

import java.util.Scanner;

public class umnozhenie_12 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        float num1 = 2;
        System.out.println("Первое число: " +num1);
        System.out.print("Напишите число на которое хотите умножить первое число: ");
        float num2 = scan.nextFloat();

        float res = num1 * num2;
        System.out.println("Результат: " +res);



    }
}
