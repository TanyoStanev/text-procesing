package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String reversed="";
            for (int i = 0; i <=input.length()-1 ; i++) {
                reversed+=input.charAt(input.length()-1-i);
            }

            System.out.printf("%s = %s%n",input, reversed);
     input= scanner.nextLine();
        }
    }
}
