package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1001 {

    public static void main(String[] args) throws IOException {

        Scanner tc = new Scanner(System.in);
        int x, y;
        x = tc.nextInt();
        y = tc.nextInt();
        System.out.println("X = " + (x + y));

        tc.close();
    }

}