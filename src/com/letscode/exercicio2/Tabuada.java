package com.letscode.exercicio2;

import com.letscode.Reader;

public class Tabuada {

    public static void print(int number){
        for (int multiplier = 1; multiplier <= 10; multiplier++){
            System.out.printf("%02d X %02d = %02d\n", number, multiplier, (number * multiplier));
        }

    }

    public static void execute(){
        System.out.println("Exercicio 02 - Tabuada");
        int firstNumber = Reader.readInt("Escolha um numero entre 1 e 10");
        System.out.printf("A tabuada do numero %d e:\n", firstNumber);
        print(firstNumber);
        System.out.println("---------------------------------------------------");
    }
}
