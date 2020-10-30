package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverseInteger(number));
    }

    public static int reverseInteger(int number) {
        int res = 0;
        while (number != 0) {
            int temp = number % 10;
            // to identify whether the number is bigger than max integer value
            if (res > 214748364 || (res == 214748364 && temp > 7)) {
                return 0;
            }
            // to identify whether the number is smaller than the minimum value
            if (res < -214748364 || (res == -214748364 && temp < -8)) {
                return 0;
            }
            res = res * 10 + temp;
            number /= 10;
        }
        return res;
    }
}
