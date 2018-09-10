//Write a program for the following condition:
//        Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should repeat n number of times in the output String.
//
//        Input1:            Stackroute
//
//        Input2:            5
//
//        Output1:           Stackrouterouterouterouterouteroute
//
//
//
//        Input1:            Stackroute
//
//        Input2:            2
//
//        Output1:           Stackroutetete

import java.util.Scanner;
public class repeatChar {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input String:");
        StringBuffer inpString = new StringBuffer();
        inpString.append(scan.nextLine());
        System.out.println("Input Value:");
        int value=scan.nextInt();
        int strLen=inpString.length();
        int temp=inpString.length()-value;
        System.out.println(temp);
        for(int i=0;i<value;i++){
            for(int j=temp;j<=strLen-1;j++)
                inpString.append(inpString.charAt(j));
        }
        System.out.println(inpString);
    }
}
