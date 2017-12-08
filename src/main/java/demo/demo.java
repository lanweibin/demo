package demo;

public class demo {
    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;


        for (int i = 0; i < n - 1; i++) {
            System.out.println(arr[0][i]);

        }

        for (int j = 0; j < m - 1; j++) {
            System.out.println(arr[j][n - 1]);

        }

        for (int k = n - 1; k >= 1; k--) {
            System.out.println(arr[m - 1][k]);

        }

        for (int l = m - 1; l >= 1; l--) {
            System.out.println(arr[l][0]);

        }
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        print(arr);
    }
}
