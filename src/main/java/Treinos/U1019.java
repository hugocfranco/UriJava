package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1019 {

    public static void main(String[] args) throws IOException {

        Scanner tc = new Scanner(System.in);
        int x, y, z, w;
        x = tc.nextInt();
        y = (x / 3600);
        z = (x % 3600) / 60;
        w = (x % 3600) % 60;

        System.out.println("" + y + ":" + z + ":" + w);

        tc.close();
    }

}