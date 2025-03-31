package org.udemy.UnidadeOito; // pertence ao package

//CircunferenciaEsferaMain.java


// Lê um valor numérico, exibe o valor de uma circunferência e o volume de uma esfera para o raio com o valor inserido. Informa ainda o valor de PI com duas casas decimais




import java.util.Scanner; // utiliza Scanner


public class CircunferenciaEsferaMain {


    public static void main (String[] args){

        // Instanciação do objeto Scanner para ler entradas  do usuário via teclado
        Scanner sc = new Scanner (System.in);

        // Instanciação do objeto circunEsfer
        CircunferenciaEsfera circunEsfer = new CircunferenciaEsfera();

        // Prompt
        System.out.print("Enter radius: ");
        circunEsfer.raio = sc.nextDouble(); // Lê o raio e insere no objeto

        System.out.println();

        // Exibe dados do objeto: circunferência, volume e PI com duas casas decimais
        System.out.print(circunEsfer);

        // encerra Scanner
        sc.close();

    } // fim da main

} // fim da classe CircunferenciaEsferaMain
