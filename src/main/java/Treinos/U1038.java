package Treinos;

import java.io.IOException;
import java.util.Scanner;

public class U1038 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int codigo, quantidade;
        double valor;
        final int cachorroQuente = 1;
        final int xSalada = 2;
        final int xBacon = 3;
        final int torradaSimples = 4;
        final int refrigerante = 5;
        String valorConvertido;

        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        switch (codigo) {
        case cachorroQuente:
            valor = quantidade * 4.00;
            valorConvertido = String.format("%.2f", valor);
            System.out.println("Total: R$ " + valorConvertido);
            break;
        case xSalada:
            valor = quantidade * 4.50;
            valorConvertido = String.format("%.2f", valor);
            System.out.println("Total: R$ " + valorConvertido);
            break;
        case xBacon:
            valor = quantidade * 5.00;
            valorConvertido = String.format("%.2f", valor);
            System.out.println("Total: R$ " + valorConvertido);
            break;
        case torradaSimples:
            valor = quantidade * 2.00;
            valorConvertido = String.format("%.2f", valor);
            System.out.println("Total: R$ " + valorConvertido);
            break;
        case refrigerante:
            valor = quantidade * 1.50;
            valorConvertido = String.format("%.2f", valor);
            System.out.println("Total: R$ " + valorConvertido);
            break;
        default:
            break;
        }

        teclado.close();
    }
}