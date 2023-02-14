import java.util.*;

class angrams {
    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {

            char[] s1Char = s1.toCharArray();
            char[] s2Char = s2.toCharArray();
            Arrays.sort(s1Char);
            Arrays.sort(s2Char);
 
            Boolean result=Arrays.equals(s1Char, s2Char);
            if(result){System.out.println("Yes");}
            else{System.out.println("No");}
        } else {
            System.out.println("Length is not equal");
        }
    }
}