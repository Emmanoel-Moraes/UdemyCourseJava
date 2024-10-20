// ParOuImpar.java

// Lê um inteiro e verifica a paridade, exibindo o resultado

import java.util.Scanner; // Utiliza Scanner para receber dados via prompt

public class ParOuImpar {

    // Inicia execução do programa
    public static void main (String[] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);


        int numero = sc.nextInt(); // Lê um inteiro e atribui a numero

        // Exibe o resultado do teste  de paridade do numero
        System.out.println((numero % 2 == 0) ? "PAR" : "NEGATIVO");

        sc.close();

    } // fim da main

} // fim da classe ParOuImpar
