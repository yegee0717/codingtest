import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = a.toUpperCase();
        
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            char d = b.charAt(i);
            if(c == d) System.out.print(Character.toLowerCase(c));
            else System.out.print(Character.toUpperCase(c));
        }
    }
}