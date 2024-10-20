// SwitchCase.java
// Lê um inteiro e exibe uma mensagem de acordo com o valor inserido por meio do Switch Case

import java.util.Scanner; // Utiliza Scanner para ler dados via prompt

public class SwitchCase {

    // Inicia execução do programa
    public static void main (String [] args){


        // Habilita leitura de dados pela janela de comandos
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt(); // lê valor inserido no prompt e o insere em x


        switch (x) {

            case 1: System.out.println("Muito bem, você atingiu o primeiro estágio!");
                    break;
            case 2: System.out.println("Muito bem, você atingiu o segundo estágio!");
                    break;
            case 3: System.out.println("Muito bem, você atingiu o terceiro estágio!");
                    break;
            case 4: System.out.println("Muito bem, você atingiu o quarto estágio!");
                    break;
            default: System.out.println("Valor fora do padrão");
        }

        sc.close(); // encerra objeto Scanner

    } // fim da main

} // fim da classe SwitchCase

