package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1145 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int quantidadePorLinha, numeroTotal, base;
        int[] vetorOrdenado;
        String respostaAtual = "";
        String respostaAnterior = "";
        base = 0;

        quantidadePorLinha = teclado.nextInt();
        numeroTotal = teclado.nextInt();
        vetorOrdenado = new int[numeroTotal];

        for (int i = 0; i < numeroTotal; i++) {
            vetorOrdenado[i] = i + 1;
        }

        for (int i = 0; i <= numeroTotal; i += quantidadePorLinha) {
            for (int j = base; j < i; j++) {
                respostaAtual = respostaAtual + String.valueOf(vetorOrdenado[j]) + " ";
            }

            respostaAtual = respostaAtual.replaceAll(respostaAnterior, "");
            respostaAnterior = respostaAtual;
            base = i;

            if (respostaAtual.length() > 0) {
                respostaAtual = respostaAtual.substring(0, respostaAtual.length() - 1);
                System.out.println(respostaAtual);
            }

            respostaAtual = "";
        }

        teclado.close();
    }
}