package Second;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter word:");
        String word = scanner.nextLine();
        System.out.println("Reversed word: " + reverse(word));

    }

    public static String reverse(String s) {

        char[] xd = new char[s.length()];
        int index = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            xd[index] = s.charAt(i);
            index++;
        }

        String reversedWord = new String(xd);
        return reversedWord;
        
    }
    
}
