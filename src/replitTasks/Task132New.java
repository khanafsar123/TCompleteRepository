package replitTasks;

public class Task132New {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);



    int [][] newArray = reduce10(a);
   for (int[] array : newArray) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
    static int[][] reduce10(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = nums[i][j] - 10;
            }
        }
        return nums;
    }
}

