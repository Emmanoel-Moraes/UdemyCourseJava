// VerificaCoordenadas.java

// Lê 2 coordenadas de um ponto no plano enquanto sejam diferentes de zero e determina a qual quadrante pertencem

import java.util.Scanner;


public class VerificaCoordenadas {

    // Inicia execução do programa
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        // Lê e armazena as coordenadas do ponto
        int x = sc.nextInt(), y = sc.nextInt();


        // Enquanto x e y forem positivos
        while (x != 0 && y != 0){

            // se x e y são positivos
            if (x > 0.0 && y > 0.0) {
                System.out.println("primeiro");
                x = sc.nextInt();
                y = sc.nextInt();

            }

            // se x é negativo e y é positivo
            else if (x < 0.0 && y > 0.0) {
                System.out.println("segundo");

                x = sc.nextInt();
                y = sc.nextInt();
            }

            // se x e y são negativos
            else if (x < 0.0 && y < 0.0) {
                System.out.println("terceiro");
                x = sc.nextInt();
                y = sc.nextInt();

            }

            // se x é positivo e y é negativo
            else{
                System.out.println("quarto");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }

        sc.close(); // encerra objeto scanner

    } // fim da main

} // finaliza classe VerificaCoordenadas
