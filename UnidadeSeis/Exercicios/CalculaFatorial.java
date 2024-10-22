// CalculaFatorial.java

// Lê um valor N, calcula e exibe seu respectivo fatorial

import java.util.Scanner; // Utiliza Scanner

public class CalculaFatorial {

    // Inicia execução do programa
    public static void main (String [] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        // Lê um inteiro e armazena em N
        int N = sc.nextInt(),
        fatorial = 1;


        for (int i = 1; i <= N; i++){

            fatorial *= i;
        }

        //Exibe fatorial de N
        System.out.println(fatorial);

        sc.close(); // encerra objeto scanner

    } // fim da main

} // fim da classe CalculaFatorial

