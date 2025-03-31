package org.udemy.UnidadeOito.Exercicios; // pertence ao package
// Aluno.java
// Classe aluno com atributos e métodos


public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;


    // calcula média e retorna média formatada
    public String media() {
        return "FINAL GRADE = " + String.format("%.2f\n", nota1 + nota2 + nota3);
    }


    // Exibe resultado final do aluno
    public void result() {

        if ((nota1 + nota2 +  nota3) >= 60.00) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.00 - (nota1 + nota2 +  nota3));
        }
    }
}