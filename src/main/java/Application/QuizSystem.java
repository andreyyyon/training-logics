package Application;

import java.util.Scanner;

public class QuizSystem {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int total = 0;

        System.out.println("===============================");
        System.out.println("Ola usuario! Digite seu nome:");
        String nome = entrada.nextLine();
        System.out.println("===============================");
        System.out.println("Bem-vindo " + nome);
        System.out.println("Quiz - Frutas");

        System.out.println("A) Qual a cor da banana?");
        System.out.println("1- Amarela" +
                "\n2- Verde" +
                "\n3- Azul" +
                "\n4- Roxa"
        );
        int escolha1 = entrada.nextInt();
        if(escolha1 == 1){
            total = total + 1;
            System.out.println("Acertou.");
        }else{
            System.out.println("Errou.");
        }

        System.out.println("=================================");
        System.out.println("B) Qual desses alimentos não é uma fruta?");
        System.out.println("1- Abacaxi." +
                "\n2- Laranja." +
                "\n3- Tomate." +
                "\n4- Repolho."
        );
        int escolha2 = entrada.nextInt();
        if( escolha2 == 4){
            total = total + 1;
            System.out.println("Acertou.");
        }else{
            System.out.println("Errou.");
        }
        System.out.println("==================================");
        System.out.println("C) Quem é i rei das frutas?");
        System.out.println("1- Morango." +
                "\n2- Abacaxi." +
                "\n3- Uva." +
                "\n4- Pitaia."
        );
        int escolha3 = entrada.nextInt();
        if(escolha3 == 2){
            total = total + 1;
            System.out.println("Acertou.");
        }else{
            System.out.println("Errou.");
        }
        System.out.println("====================================");
        System.out.println("Você acertou um total de " + total + " pontos.");
        System.out.println("====================================");
        if(total > 1){
            System.out.println("Parabens " + nome + " você passou no teste.");
        }else{
            System.out.println("Infelizmente você reprovou no teste :(.");
        }
    }
}