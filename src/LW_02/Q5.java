package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText=input.nextLine();

        StringTokenizer tokenizer=new StringTokenizer(inputText, " ");

        StringBuilder processed=new StringBuilder();
        while(tokenizer.hasMoreTokens()){
            String text=tokenizer.nextToken().toLowerCase();
            text=text.replaceAll("[^a-z0-9]", "");
            processed.append(text);
        }

        String processedStr=processed.toString();
        String backwardStr=processed.reverse().toString();

        if(processedStr.equals(backwardStr)){
            System.out.println("The sentence is a palindrome.");
        }else{
            System.out.println("The sentence is not a palindrome.");
        }
    }
}
