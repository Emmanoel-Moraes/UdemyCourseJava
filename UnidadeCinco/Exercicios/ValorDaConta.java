// ValorDaConta.java

// Lê um código de um item e a quantidade, calcula o valor a pagar e exibe em tela esse valor

import java.util.Scanner; // Utiliza Scanner para ler valores inseridos via prompt
import java.util.Locale; // Utiliza Locale

public class ValorDaConta {

    // Inicia execução do  programa
    public static void main (String[] args){

        // Habilita leitura de dados via  janela de comando
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);


        System.out.println("CODIGO\tESPECIFICAÇÃO\tPREÇO");
        System.out.println("1\t\tCachorro Quente\tR$ 4.00");
        System.out.println("2\t\tX-Salada\tR$ 4.50");
        System.out.println("3\t\tX-Bacon\tR$ 5.00");
        System.out.println("4\t\tTorrada Simples\tR$ 2.00");
        System.out.println("5\t\tRefrigerante\tR$ 1.50");

        // Lê dois inteiros e os armazena
        int codigo = sc.nextInt(), quantidade = sc.nextInt();

        double total;

        switch (codigo){

            case 1: total = 4.00 * quantidade;
                    break;
            case 2: total = 4.50 * quantidade;
                    break;
            case 3: total = 5.00 * quantidade;
                    break;
            case 4: total = 2.00 * quantidade;
                    break;
            case 5: total = 1.50 * quantidade;
                    break;
            default: System.out.println("Código Inválido");
                     total = 0;
                     break;
        }

        System.out.printf("Total: R$ %.2f", total);

        sc.close(); // finaliza scanner

    } // fim da  main

} // fim da classe ValorDaConta
