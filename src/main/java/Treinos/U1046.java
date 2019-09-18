package Treinos;

import java.util.Scanner;

public final class U1046 {

    public static int DuracaoDeJogo(int horaInicial, int horaFinal) {
        if (horaInicial >= horaFinal) {
            horaFinal += 24;
        }

        return horaFinal - horaInicial;
    }

    public static void main(String[] args) {
        Scanner lerInteiro = new Scanner(System.in);

        int horaInicial = lerInteiro.nextInt();
        int horaFinal = lerInteiro.nextInt();
        int duracaoDeJogo = DuracaoDeJogo(horaInicial, horaFinal);

        System.out.println("O JOGO DUROU " + duracaoDeJogo + " HORA(S)");

        lerInteiro.close();
    }
}
