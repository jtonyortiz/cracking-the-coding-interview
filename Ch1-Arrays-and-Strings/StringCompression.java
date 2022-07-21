//
//Author: James Ortiz
//File: StringCompression.java
//Compile: javac StringCompression.java
//java StringCompression
//


import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.HashSet;

public class StringCompression {
    private static final String AABCCCCDDDAAAA = "aabccccdddaaaa";

    public static void main(String[] args) {
        String s = AABCCCCDDDAAAA;

        int frequency = 0;

        StringBuilder sb = new StringBuilder();

        HashSet<Character> hm = new HashSet<>();

        hm.add(s.charAt(0));

        for (int index = 0; index < s.length(); index++) {
          if(hm.contains(s.charAt(index))){
              frequency++;
          }else{
              sb.append(s.charAt(index-1));
              sb.append(Character.forDigit(frequency, 10));
              hm.clear();
              frequency = 1;
              hm.add(s.charAt(index));

            
          }

        }

        String CompressionStr = sb.toString();

        System.out.println(CompressionStr);
    }
}
