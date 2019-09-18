package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1036 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, delta, variavel1, variavel2;
        String resposta1, resposta2;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        delta = Math.pow(b, 2) - (4 * a * c);

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            variavel1 = (-b + Math.sqrt(delta)) / (2 * a);
            variavel2 = (-b - Math.sqrt(delta)) / (2 * a);
            resposta1 = String.format("%.5f", variavel1);
            resposta2 = String.format("%.5f", variavel2);
            System.out.println("R1 = " + resposta1);
            System.out.println("R2 = " + resposta2);
        }

        teclado.close();
    }
}