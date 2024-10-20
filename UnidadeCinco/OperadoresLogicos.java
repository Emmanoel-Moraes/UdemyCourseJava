// OperadoresLogicos.java

// Exibe os 3 operadores lógicos em java ( E, OU e NÃO)

import java.util.Scanner;

public class OperadoresLogicos {

    // inicia execução do  programa
    public static void  main (String[] args){

        // habilita leitura de dados via janela de  comando
        Scanner sc = new Scanner (System.in);


        int x, y;

        // prompt
        System.out.println("Insira um inteiro para X: ");
        x = sc.nextInt(); // x recebe valor inserido pelo usuário

        // prompt
        System.out.println("Insira um inteiro para Y: ");
        y = sc.nextInt(); // y recebe valor inserido pelo usuário

        System.out.println("\nOperador 'E' retorna valor verdadeiro se todas as condições forem satisfeitas\nExemplo: (x > y) E (y = 6) resultado: " + (x > y && y == 6));
        System.out.println("\nOperador 'OU' retorna valor verdadeiro se ao menos uma das condições for satisfeita\nExemplo: (x > y) OU (y = 6) resultado: " + (x > y || y == 6));
        System.out.println("\nOperador 'NÃO' retorna valor falso se as condições forem satisfeitas\nExemplo: (x não é maior que y) resultado: " + !(x > y) + "\n");


        System.out.println("Tabela verdade para operador &&");
        System.out.println("A && B  resultado:");
        System.out.println("F && F  F");
        System.out.println("F && V  F");
        System.out.println("V && F  F");
        System.out.println("V && V  V");

        System.out.println("\nTabela verdade para operador ||");
        System.out.println("A || B  resultado:");
        System.out.println("F || F  F");
        System.out.println("F || V  V");
        System.out.println("V || F  V");
        System.out.println("V || V  V");


        System.out.println("\nTabela verdade para operador !");
        System.out.println("!A  resultado:");
        System.out.println("F   V");
        System.out.println("V   F");

        sc.close(); // fecha objeto scanner

    } // fim da main

} // fim da classe OperadoresLogicos
