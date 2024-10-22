// FrequenciaDeUso.java

// Enquanto tipo de combustivel inserido pelo usuário for diferente de 4, itera quantidade de combustivel abastecido (Alcool, gasolina ou diesel), programa encerra quando digitado 4 exibindo o total de pessoas

import java.util.Scanner; // Utiliza Scanner

public class FrequenciaDeUso {

    // Inicia execução do programa
    public static void main (String[] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        //  Lê um inteiro e armazena na variável tipoDeCombustivel
        int tipoDeCombustivel = sc.nextInt();

        // variáveis para iteração
        int alcool = 0, gasolina = 0, diesel = 0;

        while (tipoDeCombustivel != 4){

            if (tipoDeCombustivel == 1){
                alcool ++;
                tipoDeCombustivel = sc.nextInt();
            }

            else if (tipoDeCombustivel == 2) {
                gasolina++;
                tipoDeCombustivel = sc.nextInt();
            }

            else if (tipoDeCombustivel == 3) {
                diesel++;
                tipoDeCombustivel = sc.nextInt();
            }

            else
                tipoDeCombustivel = sc.nextInt();
        }


        // Exibe mensagem de agradecimento e quantidade de pessoas que abasteceram cada tipo de combustível
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: "  + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close(); // encerra objeto Scanner

    } // fim da main

} // fim da classe FrequenciaDeUso
