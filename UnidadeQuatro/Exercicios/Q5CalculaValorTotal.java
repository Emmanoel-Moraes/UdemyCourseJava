// Q5CalculaValorTotal.java

// Exercício 5
// Proposta:
// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.



import java.util.Scanner; // utiliza Scanner
import java.util.Locale; // utiliza Locale




public class Q5CalculaValorTotal {

    // inicia execução
    public static void main (String [] args){

        // Habilita padrão US de texto e formatação
        Locale.setDefault(Locale.US);

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        // instanciando código e número de peças
        int codigoPeca1, numeroDePecas1,
            codigoPeca2, numeroDePecas2;
        double valorUnitario1, valorUnitario2;

        // variável valorAPagar
        double valorAPagar;
        // insere valores para peças 1
        codigoPeca1 = sc.nextInt();
        numeroDePecas1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();

        // insere valores para peças 2
        codigoPeca2 = sc.nextInt();
        numeroDePecas2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        // calcula valor a pagare insere na respectiva variável
        valorAPagar = (numeroDePecas1 * valorUnitario1) + (numeroDePecas2 * valorUnitario2);

        // Exibe valor a pagar
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorAPagar);

    } // fim da main

}// fim da classe Q5CalculaValorTotal
