package LW_02;

import java.util.Scanner;

public class Q2{
    public static int digitLength(int value){
        if(value==0){
            return 1;
        }

        int size=0;
        while(value!=0){
            value/=10;
            size++;
        }
        return size;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        while(true){
            System.out.print("Enter an integer (Enter a negative number to stop): ");
            int entry=input.nextInt();

            if(entry<0){
                break;
            }

            int size=digitLength(entry);
            System.out.println(entry + " has " + size + " digit(s).");
        }
    }
}

