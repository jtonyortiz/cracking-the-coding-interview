import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string #1: ");
        String s1 = scan.nextLine();
        System.out.println("Enter string #2: ");
        String s2 = scan.nextLine();

        Set<String> permStrings = new HashSet<>(isPerm(s2));

        if(permStrings.contains(s1)){
            System.out.println("A permutation exists.");
        }else{
            System.out.println("A permutation does not exist.");
        }

        scan.close();
    }

    public static Set<String> isPerm(String s){

        Set<String> perm = new HashSet<>();

        char initial = s.charAt(0);
        String rem = s.substring(1);
        Set<String> words =isPerm(rem);

        for(String strNew: words){
            for(int i = 0; i <= strNew.length(); i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }

        return perm;
    }

    public static String charInsert(String str, char c, int j){
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }
}
