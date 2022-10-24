package Application;

import Methods.TrianguloSystemMT;

import java.util.Scanner;

public class TrianguloSystem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TrianguloSystemMT tri = new TrianguloSystemMT();

        System.out.println("=============================================================");
        System.out.println("Digite o valor dos lados do triângulo para a identificação:");
        String triangulo = tri.triangulo(entrada.nextDouble(), entrada.nextDouble(), entrada.nextDouble());
        System.out.println("De acordo com os valores dados o seu triângulo é: " + triangulo);
    }
}
