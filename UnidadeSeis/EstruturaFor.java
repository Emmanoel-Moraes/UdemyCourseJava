// EstruturaFor.java

// Demonstra sintaxe e aplicação da estrutura for em java através da leitura de N inteiros


import java.util.Scanner; // Utiliza Scanner


public class EstruturaFor {

    // Inicia execução do programa
    public static void main(String [] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner (System.in);

        // Lê inteiro, armazena em n e declara soma
        int n = sc.nextInt(), soma = 0;


        for (int i = 0; i < n; i++){
            int inteiro = sc.nextInt();
            soma += inteiro;
        }

        // Exibe soma
        System.out.println(soma);

        sc.close(); // encerra objeto scanner

    } // fim da main

} // fim da classe EstruturaFor


