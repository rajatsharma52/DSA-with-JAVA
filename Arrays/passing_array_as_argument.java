// Arguments always passed in the array as PASS BY REFERENCE not PASS BY VALUE.

// Let's take an example in which we update our marks array in another update function,
// it also updates in the main function.

package Arrays;

public class passing_array_as_argument {

    // make a function to update the marks.
    public static void update(int marks[]){

        // make a loop for all marks update.
        for(int i=0; i<marks.length; i++){

            // update all the marks(i) the marks by one.
            marks[i]= marks[i] + 1; 
        }
        return;
    }

    public static void main(String[] args) {
        
        // make an array of marks.
        int marks[]= {96,97,98};

        // call the function update to update the marks.
        update(marks);

        // print our marks.

        // make a loop for print the marks.
        System.out.println("Updated marks is:");
        for(int i=0; i<marks.length; i++){
            
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    
}
