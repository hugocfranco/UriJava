package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1002 {

    public static void main(String[] args) throws IOException {

        Scanner tc = new Scanner(System.in);
        double x, y, pi;
        pi = 3.14159;
        x = tc.nextDouble();
        y = pi * x * x;
        String resultado = String.format("%.4f", y);
        System.out.println("A=" + resultado);

        tc.close();
    }

}