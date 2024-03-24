package dz3;

public class Massive_2 {
    public static void main(String[] args) {
        int[] ints = new int[10000];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 10000);
        }
        for (int i = ints.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                }
            }
        }
        for(int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
