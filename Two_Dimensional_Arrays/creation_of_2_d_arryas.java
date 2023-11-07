package Two_Dimensional_Arrays;

import java.util.Scanner;

public class creation_of_2_d_arryas {
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int n= matrix.length, m= matrix[0].length;

        // input elements.
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // access the element
                matrix[i][j]= sc.nextInt();
            }
        }
        // output the element
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
