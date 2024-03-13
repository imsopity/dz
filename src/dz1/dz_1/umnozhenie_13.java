package dz1.dz_1;

import java.util.Scanner;

public class umnozhenie_13 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Напишите первое число: ");
        float num1 = scan.nextFloat();
        System.out.print("Напишите второе число: ");
        float num2 = scan.nextFloat();

        float res = num1 * num2;
        System.out.println("Результат: " +res);



    }
}
