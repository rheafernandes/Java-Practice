//Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.
//        Input: 5
//        Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
import java.util.Scanner;
public class iterationN {
    public void inputData(){
        System.out.println("Input:");
    }
    public void iter(int inp){
        for(int i=1;i<=inp;i++){
            for(int j=0;j<i;j++)
                System.out.print(i);
        }
    }
    public static void main(String[] args){
        iterationN obj1=new iterationN();
        obj1.inputData();
        Scanner scan= new Scanner(System.in);
        int input=scan.nextInt();
        obj1.iter(input);

    }
}