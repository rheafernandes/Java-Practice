//Write a program which accepts a number as input from user and perform the following:
//        a. sort the number in non-increasing order
//        b. after sorting sum all the even numbers, the sum should be greater than 15 .
//        c. if sum is more than 15,then print output as true or false.
//
//        Input  : 234534
//        Output : Sorted number in non-increasing order : 544332
//        Sum of even numbers : 10
//        False
import java.util.Scanner;
import  java.util.Arrays;
public class sortNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input:");
        int number=scan.nextInt(),count=0,sum=0;//Count to check the number of digits
        int temp1=number;
        for(;temp1!=0;temp1/=10,count++);
        int[] array=new int[count];
        for(int i=0;i<count;i++) {
            int temp = number % 10;
            if(i%2==0)
            sum+=temp;
            array[i] = temp;
            number=number/10;
        }
        Arrays.sort(array);
        System.out.print("Output:\t");
        for(int i=count-1;i>=0;i--){
            System.out.print(+array[i]);

        }
        System.out.println("\nSum:"+sum);
        if(sum>15)
            System.out.println("True");
        else
            System.out.println("False");


    }
}




