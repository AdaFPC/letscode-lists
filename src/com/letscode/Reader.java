package com.letscode;

import java.util.Scanner;

public class Reader {
    public static int readInt(String message){
    System.out.println(message);

        Scanner number = new Scanner(System.in);
        int numbers = 0;
        String readNumbers = number.next();
        numbers = Integer.parseInt(readNumbers);
        return numbers;
    }
    public static double readDouble(String message){
        System.out.println(message);

        Scanner number = new Scanner(System.in);
        double numbers = 0;
        String readNumbers = number.next();
        numbers = Double.parseDouble(readNumbers);
        return numbers;
    }


}
