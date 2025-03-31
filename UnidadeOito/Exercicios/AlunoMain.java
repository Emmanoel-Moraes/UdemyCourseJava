package org.udemy.UnidadeOito.Exercicios; // pertence ao package

import java.util.Scanner; // Utiliza Scanner


public class AlunoMain {


    // Início da execução do programa
    public static void main(String[] args){

        Scanner sc  = new Scanner (System.in);
        Aluno aluno = new Aluno();


        // Recebe nome
        aluno.nome = sc.nextLine();

        // Recebe as 3 notas do Aluno
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();


        // Exibe média do aluno
        System.out.printf(aluno.media());

        // Exibe  resultado  final do aluno
        aluno.result();


    } // fim da main

} // fim da classe AlunoMain.java
