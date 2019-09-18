package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1061 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        String entradaDiaInicial, entradaHorarioInicial, entradaDiaFinal, entradaHorarioFinal;
        int valorDiaInicial, valorDiaFinal, valorHoraInicial, valorHoraFinal;
        int valorMinutoInicial, valorMinutoFinal, valorSegundoInicial, valorSegundoFinal;
        int segundosTotalInicial, segundosTotalFinal, saidaDia, saidaHora, saidaMinuto, saidaSegundo;
        int segundosTotalMedio;

        entradaDiaInicial = teclado.nextLine();
        entradaHorarioInicial = teclado.nextLine();
        entradaDiaFinal = teclado.nextLine();
        entradaHorarioFinal = teclado.nextLine();

        valorDiaInicial = Integer.parseInt(entradaDiaInicial.substring(4));
        valorDiaFinal = Integer.parseInt(entradaDiaFinal.substring(4));

        valorHoraInicial = Integer.parseInt(entradaHorarioInicial.substring(0, 2));
        valorMinutoInicial = Integer.parseInt(entradaHorarioInicial.substring(5, 7));
        valorSegundoInicial = Integer.parseInt(entradaHorarioInicial.substring(10, 12));
        valorHoraFinal = Integer.parseInt(entradaHorarioFinal.substring(0, 2));
        valorMinutoFinal = Integer.parseInt(entradaHorarioFinal.substring(5, 7));
        valorSegundoFinal = Integer.parseInt(entradaHorarioFinal.substring(10, 12));

        segundosTotalInicial = (valorDiaInicial * 86400) + (valorHoraInicial * 3600) + (valorMinutoInicial * 60)
                + (valorSegundoInicial);

        segundosTotalFinal = (valorDiaFinal * 86400) + (valorHoraFinal * 3600) + (valorMinutoFinal * 60)
                + (valorSegundoFinal);

        segundosTotalMedio = segundosTotalFinal - segundosTotalInicial;

        saidaDia = segundosTotalMedio / 86400;
        saidaHora = (segundosTotalMedio % 86400) / 3600;
        saidaMinuto = ((segundosTotalMedio % 86400) % 3600) / 60;
        saidaSegundo = ((segundosTotalMedio % 86400) % 3600) % 60;

        System.out.printf("%d dia(s)\n", saidaDia);
        System.out.printf("%d hora(s)\n", saidaHora);
        System.out.printf("%d minuto(s)\n", saidaMinuto);
        System.out.printf("%d segundo(s)\n", saidaSegundo);

        teclado.close();
    }
}