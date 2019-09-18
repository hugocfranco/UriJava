package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1080 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int entrada, maior, index;
        maior = 0;
        index = 0;

        for (int i = 1; i <= 100; i++) {
            entrada = teclado.nextInt();
            if (entrada > maior) {
                maior = entrada;
                index = i;
            }
        }

        System.out.println(maior);
        System.out.println(index);

        teclado.close();
    }
}