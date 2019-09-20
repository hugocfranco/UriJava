package Treinos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class U1234 {

    public static void main(String[] args) throws IOException {

        Scanner lerString = new Scanner(System.in);

        while (lerString.hasNext()) {

            String linhaLida = lerString.nextLine();
            List<String> letrasStrings = new ArrayList<String>();
            List<String> ordenadaCharSequences = new LinkedList<String>();

            letrasStrings = Arrays.asList(linhaLida.split(""));

            int j = -1;
            for (int i = 0; i < letrasStrings.size(); i++) {

                boolean saida = !(Arrays.asList(letrasStrings.get(i)).contains(" "));
                if (saida) {
                    j++;
                }

                if (j % 2 == 0) {
                    ordenadaCharSequences.add(String.valueOf(letrasStrings.get(i).toUpperCase().charAt(0)));
                } else {

                    ordenadaCharSequences.add(String.valueOf(letrasStrings.get(i).toLowerCase().charAt(0)));
                }
            }

            String resposta = ordenadaCharSequences.stream().map(String::valueOf).collect(Collectors.joining());

            System.out.println(resposta);
        }

        lerString.close();
    }

}