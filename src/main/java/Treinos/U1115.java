package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1115 {

    public static void main(String[] args) throws IOException {

        Scanner tec = new Scanner(System.in);
        int x = tec.nextInt();
        int y = tec.nextInt();
        while (x != 0 && y != 0) {
            if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            x = tec.nextInt();
            y = tec.nextInt();
        }

        tec.close();
    }
}