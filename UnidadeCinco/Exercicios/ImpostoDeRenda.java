// ImpostoDeRenda.java

// Lê um valor, atribui a salario, calcula o Imposto de Renda referente e exibe o valor a ser pago


// Utiliza Scanner para ler dados via prompt de comando
import java.util.Scanner;


public class ImpostoDeRenda {

    // Inicia execução do programa
    public static void main (String[] args){

        // Habilita letura de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        // Lê um decimal e armazena em salario
        double salario = sc.nextDouble();
        // variavel imposto é declarada
        double imposto = 0;

        if (salario >= 0.00 && salario <= 2000.00)
            imposto = 0;
        else if (salario >= 2000.01 && salario <= 3000.00)
            imposto = (salario - 2000.00) * 0.08;

        else if (salario >= 3000.01 && salario <= 4500.00)
            imposto = (salario - 3000.00) * 0.18 + 1000 * 0.08;

        else if (salario > 4500.00)
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;


        // Encerra objeto Scanner
        sc.close();

    } // fim da main

} // fim da classe impostoDeRenda
