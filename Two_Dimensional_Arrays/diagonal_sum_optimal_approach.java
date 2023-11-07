package Two_Dimensional_Arrays;

public class diagonal_sum_optimal_approach {

    // Optimal approach time complexity is O(n)

    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            // Sum of primary diagonal
            sum+= matrix[i][i];

            // Sum of secondary diagonal
            if(i!= matrix.length-1-i){
                 sum+= matrix[i][matrix.length-i-1];
            }
               
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4}, {5,6,7,8}, 
                        {9,10,11,12}, {13,14,15,16}};
        
        System.out.println(diagonalSum(matrix));
    }
    
}
