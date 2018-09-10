import java.util.Scanner;
public class guessNum {
    public static void main(String[] args) {
        int guessNum = (int) (Math.random() * ((100 - 1) + 1)) + 1;
        System.out.println(guessNum);
        System.out.println("Guess a number from 1 to 100");
        Scanner scan = new Scanner(System.in);
        int inputNum;
          while((inputNum=scan.nextInt())!=0) {
            while (inputNum != guessNum) {
                if (inputNum < guessNum){
                    System.out.println("You guessed lower");
                    System.out.println("Guess a number from 1 to 100");
                    inputNum=scan.nextInt();
                }
                if (inputNum > guessNum) {
                    System.out.println("You guessed higher");
                    System.out.println("Guess a number from 1 to 100");
                    inputNum=scan.nextInt();
                }
            }
            System.out.println("You guessed right!");
            guessNum = (int) (Math.random() * ((100 - 1) + 1)) + 1;
            System.out.println("Guess a number from 1 to 100");

          }
    }
    }

