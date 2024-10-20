// ModificaPadraoDeExibicaoInsercaoDeDados.java

// Demonstra utilizades da classe Locale na exibição e inserção de dados

// Importa classe Locale
import java.util.Locale;

// Importa classe Scanner para entrada de dados
import java.util.Scanner;

public class ModificaPadraoDeExibicaoInsercaoDeDados {

    // inicio da execução do programa
    public static void main(String [] args){

        //Habilita padrão US no programa
        Locale.setDefault(Locale.US);

        // cria objeto Scanner e habilita a entrada de dados via janela prompt
        Scanner sc = new Scanner(System.in);


        double numero; // variável numero é criada

        // prompt
        System.out.println("Insira um valor decimal no padrão US: ");
        // lê um decimal e insere em numero
        numero = sc.nextDouble();

        // exibe o número no padrão dos Estados Unidos
        System.out.println("O valor inserido de acordo com o padrão US foi: " + numero);

        sc.close(); // encerra objeto Scanner


    } // fim da main

} // fim da classe ModificaPadraoDeExibicaoInsercaoDeDados
