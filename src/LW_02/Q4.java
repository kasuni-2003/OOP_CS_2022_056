package LW_02;

import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[] numbers=new int[5];

        System.out.println("Enter 5 integers:");
        for(int p=0; p<numbers.length; p++){
            numbers[p]=input.nextInt();
        }
        
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;

        for(int element:numbers){
            if(element>highest){
                secondHighest=highest;
                highest=element;
            }else if(element>secondHighest && element<highest){
                secondHighest=element;
            }
        }

        if(secondHighest==Integer.MIN_VALUE){
            System.out.println("No distinct second-largest element found.");
        }else{
            System.out.println("The second-largest element is: " + secondHighest);
        }
    }
}

