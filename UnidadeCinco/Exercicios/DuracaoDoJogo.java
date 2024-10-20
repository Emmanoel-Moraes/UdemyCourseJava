// DuracaoDoJogo.java

// Lê hora inicial e final de uma partida de jogo, calcula a duração (sendo a mínima 1 hora e máxima 24 horas) ocorrendo até em dois dias diferentes

import java.util.Scanner; // Utiliza Scannner

public class DuracaoDoJogo {

    // Inicia execução do programa
    public static void main (String [] args){

        // Habilita leitura de dados via janela de comando
        Scanner sc = new Scanner (System.in);

        // horaInicial e horaFinal admitem valores entre 0 e 23
        int horaInicial = sc.nextInt(), horaFinal = sc.nextInt(), duracao;

        // Se ocorreu no mesmo dia
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }

        // Se ocorreu em dias diferentes
        else if (horaInicial > horaFinal){
            duracao = (24 - horaInicial) + horaFinal;
        }

        // se durou 24 horas (horaInicial == horaFinal
        else
            duracao = 24;

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        sc.close(); // fecha objeto scanner

    } // fim da main

} // fim da classe DuracaoDoJogo
