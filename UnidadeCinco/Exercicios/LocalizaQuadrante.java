// LocalizaQuadrante.java


// Lê dois números com uma casa decimal (x, y) que representam as coordenadas de um ponto em um plano, determina qual quadrante pertence o ponto ou se está sob um dos eixos ou na origem


// Utiliza Scanner
import java.util.Scanner;

// Utiliza Locale
import java.util.Locale;

public class LocalizaQuadrante {

    // Inicia execução do programa
    public static void main (String[] args){

        // Utiliza padrão US
        Locale.setDefault(Locale.US);

        // Habilita recebimento de dados via janela de comando
        Scanner sc = new Scanner(System.in);

        // Recebe via janela de comando os valores de x e y e os armazena
        double x = sc.nextDouble(), y = sc.nextDouble();



        if (x > 0.0 && y > 0.0) // se x e y são positivos
            System.out.println("Q1");

        else if (x < 0.0 && y > 0.0) // se x é negativo e y é positivo
            System.out.println("Q2");

        else if (x < 0.0 && y < 0.0) // se x e y são negativos
            System.out.println("Q3");

        else if (x > 0.0 && y < 0.0) // se x é positivo e y é negativo
            System.out.println("Q4");

        else if (x  == 0.0 && y != 0) // se x é 0 e y não é 0
            System.out.println("Eixo Y");

        else if (y == 0.0 && x != 0) // se y é 0 e x não é 0
            System.out.println("Eixo X");

        else // se x e y são 0
            System.out.println("Origem");

        sc.close(); // fim do objeto Scanner

    } // fim da main

} // fim da classe LocalizaQuadrante
