package Recursion_Basics;

public class tiling_problem {
    public static int tilingProblem(int n){ //2 x n (floor size)
        // Base case
        if(n == 0 || n == 1){
            return 1;
        }
        
        //Choices
        
        //1. Vertical choice
        int fn_1= tilingProblem(n-1);
        
        // 2. Horizontal choice
        int fn_2= tilingProblem(n-2);

        // Total ways.
        int totalWays= fn_1 + fn_2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
    
}
