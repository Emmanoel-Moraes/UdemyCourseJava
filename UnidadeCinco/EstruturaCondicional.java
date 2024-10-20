// EstruturaCondicional.java

// Definição:

// Estrutura condicional é uma estrutura de controle que permite que um bloco de comando seja executado mediante uma condição

/*

Estrutura simples:
if ( condição )
    {
       código
    }

Estrutura composta:
if ( condição )
       {
       código 1
       }
else
       {
       condição 2
       }
*/
// O programa utiliza estrutura condicional para definir qual mensagem será exibida na tela de acordo com  hora inserida pelo usuário


import java.util.Scanner; // Utiliza Scanner

public class EstruturaCondicional {

    // Inicia execução do programa
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int hora;

        hora = sc.nextInt(); // recebe inteiro inserido pelo usuário

        if (hora < 12)
            System.out.println("bom dia!");

        else if (hora < 18)
            System.out.println("Boa tarde!");

            else System.out.println("Boa noite");

        sc.close(); // fecha objeto scanner

    } // fim d main

} // fim da classe EstruturaCondicional.java
