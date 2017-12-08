package someday;

public class Array {
    public static int[][] getNums(int nums[][]){
        return nums;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,2},{1,3}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+",");

            }

        }
    }
}
