package dz3;

import java.util.Random;

public class Massiv_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = (int) (Math.random()*1_000_000) + 1_000_000;
        int[] numbs = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            numbs[i] = 1_000_000 + i;
        }
        System.out.println(program(numbs, randomInt));
    }

    private static int program(int[] massive, int randomInt) {
        int left = 0;
        int right = massive.length - 1;
        for (; left <= right; ) {
            int middle = left + (right - left) / 2;
            int number = massive[middle];
            if (randomInt == number) {
                return middle;
            }
            if (number < randomInt) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return 0;
    }
}
