//Write a program to reverse any string without using String Buffer.
//        Input : london
//        Output : nodnol
import java.util.Scanner;
public class revString {
    private String myString;
    private int strLen;
    public revString(String s){
        myString=s;
        strLen=myString.length();
    }
    void showRevData() {
        String temp="";
        for(int j=strLen-1;j>=0;j--) {
            temp = temp + myString.charAt(j);
        }
        System.out.println("Output is:" + temp);
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input is:");
        String test=scan.nextLine();
        revString obj1=new revString(test);
        obj1.showRevData();
    }

}
