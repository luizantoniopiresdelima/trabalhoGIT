package com.mycompany.trabalho_git;
public class operacoes {

    public static int somar(int a, int b) {
        return a + b;
    }
    
    public static int subtrair(int a, int b) {
        return a - b;
    }
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static double dividir(int a, int b) {
        return (double) a / b;
    }
    
    public static void main(String[] args) {
        int soma = somar(5, 3);
        System.out.println("Soma: " + soma); 
        
        int subtracao = subtrair(10, 4);
        System.out.println("Subtração: " + subtracao);
        
        int multiplicacao = multiplicar(6, 7);
        System.out.println("Multiplicação: " + multiplicacao); 
    
        double divisao = dividir(15, 3);
        System.out.println("Divisão: " + divisao);
    }
} 

