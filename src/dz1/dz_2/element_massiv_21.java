package dz1.dz_2;

public class element_massiv_21 {
    public static void main(String[] args){
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

//                  Цикл for
        for (int i = 0; i < nums.length; i++){
            System.out.println("Цикл for: " +nums[i]);
        }

//                    Цикл while
        int i = 0;
        while (i < nums.length){
            System.out.println("Цикл while: " +nums[i]);
            i++;
        }

//                    Цикл do while
        int b = 0;
        do {
            System.out.println("Цикл do while: " +nums[b]);
            b++;
        } while (b < nums.length);

//                     Цикл for each
        for (int num:nums) {
            System.out.println("Цикл for each: " +num);
        }
    }

}
