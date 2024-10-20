//TestaNegativo.java

//

import java.util.Scanner; // Utiliza Scanner para receber dados via prompt

public class TestaNegativo {

    // Inicia  execução do programa
    public static void main (String[] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);


        int inteiro = sc.nextInt(); // Lê um número e atribui a inteiro

        System.out.println((inteiro < 0 ? "NEGATIVO" : "NÃO NEGATIVO"));

        sc.close(); // finaliza scanner

    } // fim da main

} // fim da classe TestaNegativo
