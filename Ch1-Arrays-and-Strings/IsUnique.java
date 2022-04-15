import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsUnique{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        String str = scan.nextLine();

        //
        if(isStrUnique(str) == true){
            System.out.println("The string" + str + " does not contain unique characters. ");
        }
        else{
            System.out.println("The string " + str + " does not contain unque characters. ");
        }

        //Close scanner:
        scan.close();
    }

    public static boolean isStrUnique(String s){
        //Declare and instaitate set object
        Set<Character> charSet = new HashSet<>();

        //Iterate through String, 
        //checking each character
        for(int i = 0; i < s.length(); i++){
            if(charSet.contains(s.charAt(i))){
                return false;
            }
            else{
                charSet.add(s.charAt(i));
            }
        }
        
        //If we dont find a duplicate character, 
        //return true
        return true;
    }
}