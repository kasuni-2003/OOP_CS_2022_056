package LW_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter an odd-length word:");
        String text=input.nextLine();

        if(text.length()%2==1){
            int midPosition=text.length()/2;
            char midLetter=text.charAt(midPosition);
            System.out.println("Middle Character: "+midLetter);
        }else{
            System.out.println("The word length is not odd!");
        }
    }
}
