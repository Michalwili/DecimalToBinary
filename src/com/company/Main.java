package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dec_num, quot, i=1, k;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Decimal Number: ");
        dec_num = scan.nextInt();
        quot = dec_num;
        /*
        10
        10 % 2 = 5  remainder 0
        5 % 2 = 2   remainder 1
        2 % 2 = 1   remainder 0
        1 % 2 = 0   remainder 1
        24
        24 % 2 = 12 remainder 0
        12 % 2 = 6 remainder 0
        6 % 2 = 3 remainder 0
        3 % 2 = 1 remainder 1
        1 % 2 = 0 remainder 1
         */

        while(quot !=0) {
            bin_num[i++] = quot % 2; // i = 1 ; i++ i = 2; remember j = i - 1
            quot = quot / 2;
        }

        //System.out.println(i);
        System.out.print("Binary number is: ");
        for(k = i-1; k>0; k--) {
            System.out.print(bin_num[k]);
        }
    }
}
