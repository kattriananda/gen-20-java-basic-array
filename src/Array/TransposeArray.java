package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeArray {
    public static void transposeArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Baris = ");
        int row = in.nextInt();
        System.out.print("Masukkan Jumlah Kolom = ");
        int col = in.nextInt();

        int[][] array2D = new int[row][col];
        for (int i = 0; i < row;){
            for (int j = 0; j<col;j++){
                System.out.print("Masukkan Index Array ["+i+"] ["+j+"] = ");
                array2D[i][j]=in.nextInt();
            }
            i++;
        } System.out.println("Array 2D = "+ Arrays.deepToString(array2D));

        for (int i = 0; i<col;i++){
            for (int j = 0; j<row;j++){
                System.out.println(array2D[j][i]);
            }
        }
    }
}
