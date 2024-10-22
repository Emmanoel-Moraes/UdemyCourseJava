// CalculaDivisores.java

//  Lê um número inteiro e calcula todos os seus divisores

import java.util.Scanner; // Utiliza Scanner

public class CalculaDivisores {

    // Inicia execução do programa
    public static void main (String[] args){

        // Habilita recebimento de dados pela janela de comando
        Scanner sc = new Scanner (System.in);

        // Lê um inteiro e armazena
        int inteiro = sc.nextInt();


        // laço de repetição para analisar divisores
        for (int i = 1; i <= inteiro; i++){

            //  Se i for divisível por inteiro
            if (inteiro % i == 0){
                // exibe divisor
                System.out.println(i);
            }
        }

        sc.close(); // encerra objeto scanner

    } // fim da main

} // fimd a classe CalculaDvisores
