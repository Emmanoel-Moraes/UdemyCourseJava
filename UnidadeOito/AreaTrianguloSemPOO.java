// AreaTrianguloSemPOO.java

// Lê os lados de dois triângulos, calcula as áreas pela fórmula de Heron e exibe qual o trângulo com maior área

import java.util.Scanner; // utiliza Scanner
import java.util.Locale; // Utiliza Locale

public class AreaTrianguloSemPOO {

    // Inicia execução do programa
    public static void main (String [] args){

        // Habilita leitura de dados via janela de comandos
        Scanner sc = new Scanner (System.in);
        double aX, bX, cX,
               aY, bY, cY;

        // prompt
        System.out.println("Enter the measures of triangle X");

        // Lê lados do triângulo X
        aX = sc.nextDouble();
        bX = sc.nextDouble();
        cX = sc.nextDouble();

        // prompt
        System.out.println("Enter the measures of triangle Y");

        // Lê lados do triângulo Y
        aY = sc.nextDouble();
        bY = sc.nextDouble();
        cY = sc.nextDouble();

        // calculando p para X e Y
        double pX =  (aX + bX + cX) / 2;
        double pY =  (aY + bY + cY) / 2;

        // Calculando área dos triângulos X e Y
        double areaX = Math.sqrt(pX * (pX - aX) * (pX - bX) * (pX - cX));
        double areaY = Math.sqrt(pY * (pY - aY) * (pY - bY) * (pY - cY));

        // Exibe áreasde X e Y
        System.out.printf("Triangle X area: %.4f\n",areaX);
        System.out.printf("Triangle X area: %.4f\n",areaY);

        // Exibindo o triângulo que possui maior área
        if (areaX > areaY)
            System.out.println("Larger area: X");
        else if (areaX < areaY)
            System.out.println("Larger area: Y");
        else
            System.out.println("Both triangles are equals");

        sc.close(); // encerra objeto scanner

        
    } // fim da main

} // fim da classe AreaTrianguloSemPOO
