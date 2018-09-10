//Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
//        a. Add all the even numbers and check whether the sum is more than 25.
//        b. Print success and failure messages for all 3 conditions
//        Input : 2468642
//
//        Output : 2468642 is palindrome and the sum of even numbers is greater than 25
//
//        Input: 12345
//
//        Output: 12345 is not palindrome
//
//        Input: 12345654321
//
//        Output : 12345654321 is palindrome and sum of even numbers is less than 25

import java.util.Scanner;

public class palidrome {
    public void inputData(){
        System.out.println("Input:");
    }
    public boolean checkPalindrome(long inputData){
        long temp=inputData,sum=0,x;
        while(temp > 0) {
            x = temp % 10;
            sum = sum * 10 + x;
            temp = temp / 10;
        }
        if(sum==inputData)
            return true;
        else
            return false;
    }
    public boolean checkGreater(long inputData){
        long sum=0;
        while(inputData>0){
            if((inputData%10)%2==0)
                sum=sum+(inputData%10);
            inputData=inputData/10;
        }
        if (sum>25)
            return true;
        else
            return false;
    }
    public void showData(boolean val, boolean flag){
        if (val) {
            if(val&&flag)
                System.out.println("Is a Palindrome and sum of even numbers is greater than 25");
            else
                System.out.println("Is a Palindrome sum of even numbers but isn't greater than 25");
        }
        else
            System.out.println("Not a Palindrome");
    }

    public static void main (String [] args)
    {
        palidrome obj1=new palidrome();
        obj1.inputData();
        Scanner scan= new Scanner(System.in);
        long input=scan.nextLong();
        boolean value=obj1.checkPalindrome(input);
        boolean flag=false;
        if(value){
            flag=obj1.checkGreater(input);
        }
        obj1.showData(value,flag);
    }
}
