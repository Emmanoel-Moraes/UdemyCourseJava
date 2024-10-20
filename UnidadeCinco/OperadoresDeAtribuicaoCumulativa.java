//  OperadoresDeAtribuicao.java

// Utiliza operador simplificado para iterar valor na variável

/*

Principais operadores acumuladores:

a += b
a -= b
a *= b
a /= b
a %= b

*/

import java.util.Scanner; // Utiliza Scanner para ler dados via prompt

public class OperadoresDeAtribuicaoCumulativa {

    // Inicia execução do programa
    public static void main (String [] args){

        // Habilita leitura de dados via janela de  comando
        Scanner sc = new Scanner (System.in);


        int minutos;
        double conta = 50;

        minutos = sc.nextInt(); // atribui valor inserido pelo usuário

        // Se ultrapassar mais de 100 minutos de ligação
        if (minutos > 100){
            conta +=  (minutos - 100) * 2.0;
        }
        // Exibe conta
        System.out.printf("Valor a pagar: R$ %.2f\n", conta);

        sc.close(); // fecha objeto scanner

    } // fim da main

} // fim da classe OperadoresDeAtribuicao
