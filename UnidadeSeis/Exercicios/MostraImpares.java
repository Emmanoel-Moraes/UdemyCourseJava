// MostraImpares.java

// O programa exibe os números ímpares existentes entre 1 e um número inserido pelo usuário

import java.util.Scanner; // Utiliza Scanner

public class MostraImpares {

    // Inicia execução do programa
    public static void main (String [] args) {

        // Habilita leitura de dados pela janela de comando
        Scanner sc = new Scanner(System.in);

        // Lê um valor e armazena em x
        int x = sc.nextInt();

        if (x >= 1 && x <= 1000){

            for (int num = 1; num <= x; num++){

                // Se num for ímpar
                if (num % 2 == 1)
                    // Exibe num
                    System.out.println(num);
            }
        }

    } // fim da main

} // fim da classe MostraImpares
