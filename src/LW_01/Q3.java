package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the length in centimetres:");
        double cm= input.nextDouble();

        double inch=cm/2.54;
        int feet=(int)inch/12;
        inch%=12;

        System.out.println("The entered length is: "+feet+"feet"+" "+inch+"inches");
    }
}
