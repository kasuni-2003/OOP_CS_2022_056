package LW_02;

import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows you want for the pyramid: ");
        int rows=input.nextInt();

        for(int p=1; p<=rows; p++){
            for(int q=1; q<=rows-p; q++){
                System.out.print(" ");
            }
            for(int r=1; r<=(2*p-1); r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

