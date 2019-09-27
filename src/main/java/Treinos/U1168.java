package Treinos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U1168 {

    public static void main(String[] args) throws IOException {

        Scanner lerString = new Scanner(System.in);

        List<Integer> resposta = new ArrayList<Integer>();

        int loop = Integer.parseInt(lerString.nextLine());

        for (int i = 0; i < loop; i++) {
            int resultado = 0;
            List<Integer> inteiroFracionado = Arrays.stream(lerString.nextLine().split("\\B"))
                    .map(s -> Integer.valueOf(s)).collect(Collectors.toList());
            for (int j = 0; j < inteiroFracionado.size(); j++) {
                int numero = (inteiroFracionado.get(j));
                switch (numero) {
                case 1:
                    resultado += 2;
                    break;
                case 2:
                    resultado += 5;
                    break;
                case 3:
                    resultado += 5;
                    break;
                case 4:
                    resultado += 4;
                    break;
                case 5:
                    resultado += 5;
                    break;
                case 6:
                    resultado += 6;
                    break;
                case 7:
                    resultado += 3;
                    break;
                case 8:
                    resultado += 7;
                    break;
                case 9:
                    resultado += 6;
                    break;
                case 0:
                    resultado += 6;
                    break;
                }
            }
            resposta.add(resultado);
        }
        resposta.forEach(i -> System.out.println("" + i + " leds"));
        lerString.close();
    }
}