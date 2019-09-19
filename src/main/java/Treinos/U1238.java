package Treinos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U1238 {

    public static void main(String[] args) throws IOException {

        Scanner lerString = new Scanner(System.in);
        Scanner lerInteiro = new Scanner(System.in);

        int numeroContador = lerInteiro.nextInt();

        for (int i = 0; i < numeroContador; i++) {

            String linhaLida = lerString.nextLine();

            List<Character> ordenadaCharSequences = new ArrayList<Character>();

            if (linhaLida.equals("")) {
                System.out.println("");
            } else {

                for (int j = 0; j < Math.min(linhaLida.split(" ")[0].length(), linhaLida.split(" ")[1].length()); j++) {
                    ordenadaCharSequences.add(linhaLida.split(" ")[0].charAt(j));
                    ordenadaCharSequences.add(linhaLida.split(" ")[1].charAt(j));
                }

                if (linhaLida.split(" ")[0].length() == linhaLida.split(" ")[1].length()) {
                } else if (linhaLida.split(" ")[0].length() < linhaLida.split(" ")[1].length()) {
                    for (int j = Math.min(linhaLida.split(" ")[0].length(), linhaLida.split(" ")[1].length()); j < Math
                            .max(linhaLida.split(" ")[0].length(), linhaLida.split(" ")[1].length()); j++) {

                        ordenadaCharSequences.add(linhaLida.split(" ")[1].charAt(j));
                    }
                } else {
                    for (int j = Math.min(linhaLida.split(" ")[0].length(), linhaLida.split(" ")[1].length()); j < Math
                            .max(linhaLida.split(" ")[0].length(), linhaLida.split(" ")[1].length()); j++) {

                        ordenadaCharSequences.add(linhaLida.split(" ")[0].charAt(j));
                    }

                }
                String resposta = ordenadaCharSequences.stream().map(String::valueOf).collect(Collectors.joining());
                System.out.println(resposta);
            }
        }

        lerInteiro.close();
        lerString.close();
    }
}
