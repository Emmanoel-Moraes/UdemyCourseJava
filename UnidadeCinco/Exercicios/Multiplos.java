// Multiplos.java

// Lê dois números inteiros, verifica se são múltiplos e exibe o resultado

import java.util.Scanner; // Utiliza Scanner para receber dados via prompt

public class Multiplos {

    // Inicia execução do programa
    public static void main (String[] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner (System.in);

        // Lê dois números e armazena
        int A = sc.nextInt();
        int B = sc.nextInt();

      System.out.println((A % B == 0 || B % A == 0) ? "Sao Multiplos" : "Nao sao Multiplos");

      sc.close(); // encerra objeto scanner

    } // fim da main

} // fim da classe Multiplos
