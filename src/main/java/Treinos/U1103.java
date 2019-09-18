package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1103 {
    public static void main(String[] args) throws IOException {
        Scanner tec = new Scanner(System.in);
        String[] arr = new String[4];
        arr[0] = tec.next();
        arr[1] = tec.next();
        arr[2] = tec.next();
        arr[3] = tec.next();
        int H1 = Integer.parseInt(arr[0]);
        int M1 = Integer.parseInt(arr[1]);
        int H2 = Integer.parseInt(arr[2]);
        int M2 = Integer.parseInt(arr[3]);
        int horas;
        while (!(H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0)) {
            if (H1 * 60 + M1 > H2 * 60 + M2) {
                horas = (24 * 60 + H2 * 60 + M2) - (H1 * 60 + M1);
            } else {
                horas = (H2 * 60 + M2) - (H1 * 60 + M1);
            }
            System.out.println(horas);
            arr[0] = tec.next();
            arr[1] = tec.next();
            arr[2] = tec.next();
            arr[3] = tec.next();
            H1 = Integer.parseInt(arr[0]);
            M1 = Integer.parseInt(arr[1]);
            H2 = Integer.parseInt(arr[2]);
            M2 = Integer.parseInt(arr[3]);
        }

        tec.close();
    }
}