package org.udemy.UnidadeOito; // pertence ao package

// MembrosEstaticosMain.java

// Definição rápida:

// Membros estáticos são elementos que podem ser utilizados sem serem instanciados como objetos, ou seja, suas chamadas ocorrem a partir da própria classe que os contêm

// Utilização:

// Classes utilitárias e constantes



// FOrmas de utilizar métodos:

// 1. Método comum: cria classe e instancia um objeto daquela classe para em seguida utilizar seus métodos. EX: Objeto objeto = new Objeto(); =======>  objeto.metodo1()
// 2.  Método Main: cria os métodos dentro da classe Main. EX: metodo1(){} =====> metodo1();
// 3. Método Static: usa o parâmetro Static para tornar o membro estático dentro de uma classe. EX: Seja o método - public void static metodo1(){} da classe Classe =======> Classe.metodo1();


import java.util.Scanner; // Utiliza Scanner
import java.util.Locale; // Utiliza Locale



public class MembrosEstaticosMain {

    // declarando uma constante PI
    public static final double PI = 3.14159;


    // início da execução do programa
    public static void  main (String[] args){

        Locale.setDefault(Locale.US);

        // Instanciação do objeto Scanner para ler dados via prompt
        Scanner sc = new Scanner (System.in);


        // prompt
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble(); // Lê um valor decimal e  armazena em radius


        double c = circumference(radius);

        double v = volume(radius);

        // exibe circunferência
        System.out.printf("Circumference: %.2f\n", c);
        // exibe volume
        System.out.printf("Volume: %.2f\n", v);
        // exibe PI cpm duas casas decimais
        System.out.printf("PI value: %.2f\n", PI);


        // fecha objeto Scanner
        sc.close();



    } // fim da main


    // método estático que retorna circunferência
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    // método estático que retorna volume
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius;
    }

} // fim da classe
