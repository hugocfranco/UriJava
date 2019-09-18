package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1047 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int horaIncial, minutoInicial, horaFinal, minutoFinal, horaDiferenca, minutoDiferenca;

        horaIncial = teclado.nextInt();
        minutoInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        minutoFinal = teclado.nextInt();

        horaDiferenca = horaFinal - horaIncial;
        minutoDiferenca = minutoFinal - minutoInicial;

        if (horaDiferenca == 0) {
            horaDiferenca += 24;
        }

        if (minutoDiferenca < 0) {
            minutoDiferenca += 60;
            horaDiferenca -= 1;
        }

        if (horaDiferenca < 0) {
            horaDiferenca += 24;
        }

        if (horaDiferenca == 24 && !(horaDiferenca == 24 && minutoDiferenca == 0)) {
            horaDiferenca = 0;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horaDiferenca, minutoDiferenca);

        teclado.close();
    }
}