package com.company;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int number = in.nextInt();
        int i = 1;
        while (i < number / 2 + 1) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }
}
/* number 10
 цикл начался i = 1
 является ли i делителем number
 вывод i если оно является циклом
 */
