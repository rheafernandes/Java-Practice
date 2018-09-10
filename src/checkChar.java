//Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
//        Condition:
//        a. Print an error message if the input is not a letter
//        b. If the input having more than one letter, print the required output
//        (Vowel or Consonant) for each letter
//
//        Input : p
//        Output : Consonant
//
//        Input : ap
//        Output : Vowel Consonant (should it be a - vowel, p - consonant)
import java.util.Scanner;
public class checkChar {
    private String myString;
    private int strLen;
    public checkChar(String s){
        myString=s;
        strLen=myString.length();
    }
    void checkC() {
        for (int j = 0; j < strLen-1; j++) {

            switch (myString.charAt(j)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.print("Vowel");
                default:
                    System.out.print("Consonant");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input is:");
        String test=scan.nextLine();
        checkChar obj1=new checkChar(test);
        obj1.checkC();
    }
}






