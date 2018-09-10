//Write a program which accepts an integer number as input from the user and perform the following conditional checks:
//        a. Print Tom if number is odd and exists between 20 to 30
//        b. Print Jerry, if number is even and exists between 20 and 30
import java.util.Scanner;
public class checkNum {
    public void inputData(){
        System.out.println("Input:");
    }
    public void checkN(int inputData){
        if((inputData%2)!=0&&inputData>20&&inputData<30)
            System.out.println("Tom");
        if((inputData%2)==0&&inputData>20&&inputData<30)
            System.out.println("Jerry");
    }
    public static void main(String [] args){
        checkNum obj1=new checkNum();
        obj1.inputData();
        Scanner scan= new Scanner(System.in);
        int input=scan.nextInt();
        obj1.checkN(input);
    }
}
