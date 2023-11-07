package Two_Dimensional_Arrays;

public class diagonal_sum_brute_force_approach {

    // Brute force approach time complexity is O(n^2)

    public static int diagonalSum(int matrix[][]){
        int sum=0;

        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                // Sum of primary diagonal.
                if(i == j){
                    sum+= matrix[i][j];
                }
                // Sum of secondary diagonal.
                else if(i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4}, {5,6,7,8}, 
                        {9,10,11,12}, {13,14,15,16}};
        
        
    }
    
}
