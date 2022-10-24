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

        int pergunta = 1;

        while(pergunta == 1) {
            System.out.println("A) Qual a cor da banana?");
            System.out.println("1- Amarela" +
                    "\n2- Verde" +
                    "\n3- Azul" +
                    "\n4- Roxa"
            );
            String escolha1 = entrada.next();
            if (escolha1.equals("1")) {
                total = total + 1;
                System.out.println("Acertou.");
                pergunta = 2;
            } else if (escolha1.equals("2") || escolha1.equals("3") || escolha1.equals("4")){
                System.out.println("Errou.");
                pergunta = 2;
            }else{
                System.out.println("Nenhuma alternativa correspondente a resposta.");
                pergunta = 1;
            }
        }

        while (pergunta == 2) {
            System.out.println("=================================");
            System.out.println("B) Qual desses alimentos não é uma fruta?");
            System.out.println("1- Abacaxi." +
                    "\n2- Laranja." +
                    "\n3- Tomate." +
                    "\n4- Repolho."
            );
            String escolha2 = entrada.next();
            if (escolha2.equals("4")) {
                total = total + 1;
                System.out.println("Acertou.");
                pergunta = 3;
            } else if (escolha2.equals("2") || escolha2.equals("3") || escolha2.equals("4")){
                System.out.println("Errou.");
                pergunta = 3;
            }else{
                System.out.println("Nenhuma alternativa correspondente a resposta.");
                pergunta = 2;
            }
        }

        while (pergunta == 3) {
            System.out.println("==================================");
            System.out.println("C) Quem é o rei das frutas?");
            System.out.println("1- Morango." +
                    "\n2- Abacaxi." +
                    "\n3- Uva." +
                    "\n4- Pitaia."
            );
            String escolha3 = entrada.next();
            if (escolha3.equals("2")) {
                total = total + 1;
                System.out.println("Acertou.");
                pergunta = 0;
            } else if (escolha3.equals("1") || escolha3.equals("3") || escolha3.equals("4")){
                System.out.println("Errou.");
                pergunta = 0;
            }else{
                System.out.println("Nenhuma alternativa correspondente a resposta.");
                pergunta = 3;
            }
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