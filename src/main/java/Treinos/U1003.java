package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1003 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int entrada1, entrada2, saida;
        entrada1 = teclado.nextInt();
        entrada2 = teclado.nextInt();
        saida = entrada1 + entrada2;
        System.out.println("SOMA = " + saida);

        teclado.close();
    }
}