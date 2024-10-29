// Funcoes.java

// Utiliza função própria para encontra o maior número dentre 3 números inseridos elo usuário


import java.util.Scanner; // Utiliza Scanner

public class Funcoes {

    // Inicia execução do programa
    public static void main (String [] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner (System.in);

        // prompt
        System.out.println("Enter three integer numbers: ");

        // Lê 3 números e armazena
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println(max(a,b,c));

        sc.close(); // encerra  objeto scanner

    } // fim da main

    // função retorna o maior entre 3 números
    public static int max (int a, int b, int c){


        int maior = 0;

        if (a > b && a > c)
            maior = a;

        else if (b > c)
            maior = b;

        else
            maior  = c;

        return maior;
    } 

} // fim da classe Funcoes
