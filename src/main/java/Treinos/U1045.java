package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1045 {

    public static void main(String[] args) throws IOException {

        Scanner tec = new Scanner(System.in);
        String[] arr = new String[3];
        arr[0] = tec.next();
        arr[1] = tec.next();
        arr[2] = tec.next();
        double A = Double.parseDouble(arr[0]);
        double B = Double.parseDouble(arr[1]);
        double C = Double.parseDouble(arr[2]);
        double aux;
        while (!(A >= B && B >= C)) {
            if (A < B) {
                aux = A;
                A = B;
                B = aux;
            }
            if (B < C) {
                aux = B;
                B = C;
                C = aux;
            }
            if (A < C) {
                aux = A;
                A = C;
                C = aux;
            }
        }
        double D = B + C;
        double F = B * B + C * C;
        double E = A * A;
        if (A >= D) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (E == F) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (E > F) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (E < F) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && A != C & C != B) || (A == C && A != B & C != B) || (C == B && C != A & B != A)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            ;
        }

        tec.close();
    }

}