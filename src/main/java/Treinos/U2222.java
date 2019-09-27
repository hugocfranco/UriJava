package Treinos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class U2222 {

    public static void main(String[] args) throws IOException {

        Scanner lerString = new Scanner(System.in);

        List<Integer> respostas = new ArrayList<Integer>();

        int numeroDeInstancias = Integer.parseInt(lerString.nextLine());
        for (int i = 0; i < numeroDeInstancias; i++) {

            int quantidadeConjutos = Integer.parseInt(lerString.nextLine());
            ArrayList<BitSet> todosOsConjuntos = new ArrayList<BitSet>();

            for (int j = 0; j < quantidadeConjutos; j++) {
                String linhaLida[] = new String[61];
                linhaLida = lerString.nextLine().split(" ");
                BitSet conjunto = new BitSet(60);

                for (int k = 0; k < Integer.parseInt(linhaLida[0]); k++) {

                    conjunto.set(Integer.parseInt(linhaLida[k + 1]));
                }

                todosOsConjuntos.add(conjunto);
            }

            int quantidadeCalculos = Integer.parseInt(lerString.nextLine());

            BitSet conjuntoUniao = new BitSet(60);
            for (int j = 0; j < quantidadeCalculos; j++) {

                String linhaLida[] = lerString.nextLine().split(" ");
                conjuntoUniao.clear();
                conjuntoUniao = (BitSet) todosOsConjuntos.get(Integer.parseInt(linhaLida[1]) - 1).clone();
                conjuntoUniao.or(todosOsConjuntos.get(Integer.parseInt(linhaLida[2]) - 1));

                if (linhaLida[0].equals("1")) {

                    respostas.add(-1 * (conjuntoUniao.cardinality()
                            - todosOsConjuntos.get(Integer.parseInt(linhaLida[1]) - 1).cardinality()
                            - todosOsConjuntos.get(Integer.parseInt(linhaLida[2]) - 1).cardinality()));

                } else {
                    respostas.add(conjuntoUniao.cardinality());
                }

            }
        }

        respostas.forEach(System.out::println);
        lerString.close();
    }
}