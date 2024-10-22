// CelsiusToFahrenheit.java

// Lê uma temperatura em Celsius e converte em Fahrenheit, ao final, pergunta se deseja relaizar o processo novamente


import java.util.Scanner; // Utiliza Scanner;
import java.util.Locale; // Utiliza Locale

public class CelsiusToFahrenheit {

    // Inicia execução do programa
    public static  void main (String [] args){

        // Define padrão US para recebimento e exibição de dados
        Locale.setDefault(Locale.US);
        // Habilita leitura de dados via janela de comandos
        Scanner sc = new Scanner (System.in);

        // variável opc para receber opção do usuário
        char opc;

        do{
            // prompt
            System.out.println("Digite a temperatura em Celsius: ");
            double tempCelsius = sc.nextDouble();

            //  converte temperatura e armazena resultado
            double tempFahrenheit = (9 * tempCelsius) / 5 + 32;

            // exibe temperatura em Fahrenheit
            System.out.printf("Equivalente em Fahrenheit: %.1f", tempFahrenheit);

            // prompt
            System.out.print("Deseja repetir? ");
            opc = sc.nextLine().charAt(0);

        } while (opc == 's');


        sc.close(); // encerra objeto scanner

    } // fim da main

} // fim da classe CelsiusToFahrenheit
