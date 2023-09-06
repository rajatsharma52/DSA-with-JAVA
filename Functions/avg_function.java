package Functions;

public class avg_function {

    public static float average(float a, float b, float c){
        float average= (a+b+c)/3;
        return average;
    }

    public static void main(String[] args) {

        float avg= average(1,6,10);
        System.out.println("Average of the number is:" + avg);
        
    }
    
}
