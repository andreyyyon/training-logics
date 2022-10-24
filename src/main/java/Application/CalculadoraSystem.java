package Application;

import Methods.CalculadoraSystemMT;

import java.util.Scanner;

public class CalculadoraSystem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculadoraSystemMT metodoOP = new CalculadoraSystemMT();

        System.out.println("Digite a operação:");
        metodoOP.operador(entrada.nextInt(), entrada.next(), entrada.nextInt());
    }
}
