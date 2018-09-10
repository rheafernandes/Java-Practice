//Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together. The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
//        Input :  12 23 2 4
//        Output : 41
import java.util.Scanner;
import java.lang.Character.*;
public class addNum {
    void addData(){
        int number,sum=0;
        System.out.println("Input:");
        Scanner input=new Scanner(System.in);
        while((number=input.nextInt())!=0){
            if(!(number>='0')&&!(number<='9')){
                System.out.println("Error not a number");
            }
            sum=sum+number;
        }
        System.out.println("Output:"+sum);
    }
    public static void main(String[] args){
        addNum obj1=new addNum();
        obj1.addData();

    }
}

