package com.letscode.exercicio1;

import com.letscode.Reader;

public class Calculator {
    public static int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public static int multiplication(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public static int division(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }


    public static void print(int firstNumber, int secondNumber){
        System.out.println(addition(firstNumber,secondNumber));
        System.out.println(subtraction(firstNumber,secondNumber));
        System.out.println(multiplication(firstNumber,secondNumber));
        System.out.println(division(firstNumber,secondNumber));
    }

    public static void execute(){
        System.out.println("Exercicio 01 - Calculadora");
        int firstNumber = Reader.readInt("Digite um numero");
        int secondNumber = Reader.readInt("Digite um segundo numero");
        print(firstNumber, secondNumber);
        System.out.println("---------------------------------------------------");
    }
}
