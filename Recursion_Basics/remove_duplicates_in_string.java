package Recursion_Basics;

public class remove_duplicates_in_string {
    public static void removeDuplicates(String str, int index, StringBuilder newString, boolean map[]){
        //Base case
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currentCharacter= str.charAt(index);
        if(map[currentCharacter - 'a'] == true){
            //condition of duplicate
            removeDuplicates(str, index+1, newString, map);
        }
        else{
            map[currentCharacter - 'a'] = true;
            removeDuplicates(str, index+1, newString.append(currentCharacter), map);
        }
    }
    public static void main(String[] args) {
        String str= "appnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
    
}
