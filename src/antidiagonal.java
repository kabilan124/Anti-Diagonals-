import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public void antidiagonalcount(int[][] l) {

        int r = l.length;
        int c = l[0].length;

        for (int x = 0; x <= c - 1; x++) {
            int i = 0;
            int j = x;
            int[] arr = new int[r];
            while (i < c && j >= 0) {
                arr[i] = l[i][j];
                i++;
                j--;
            }

            System.out.println(Arrays.toString(arr));
        }
        for (int y = 1; y < r; y++) {
            int j = c - 1;
            int i = y;
            int[] arr = new int[r];
            while (i < r && j >= 0) {
                arr[r-j-1] = l[i][j];
                i++;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

public class antidiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows size: ");
        int rows = sc.nextInt();
        System.out.print("enter the column size: ");
        int column = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int[][] arr = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Solution answer = new Solution();
        if(rows == column) {
            answer.antidiagonalcount(arr);
        }
        else{
            System.out.println("invalid matrix");
        }
    }
}