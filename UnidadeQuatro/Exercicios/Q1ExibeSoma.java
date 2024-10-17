// Q1ExibeSoma.java

// Exercício 1
// Proposta:
// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa


import java.util.Scanner; // Utiliza recebimento de dados via prompt

public class Q1ExibeSoma {

    public static void main (String [] args){

        Scanner  sc = new Scanner (System.in); // Declara objeto Scanner, habilita leitura de dados via prmpt

        // Instancia dois inteiros
        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        // Exibe soma dos núemros inseridos
        System.out.println("SOMA = " + (num1 + num2));

    } // fim da main

} // fim da classe Q1ExibeSoma
