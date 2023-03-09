package prog5;

import java.util.Scanner;

public class Prog5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String word = scan.next();
        System.out.print("Output: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
