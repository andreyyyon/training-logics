package Application;

import Methods.BankSystemMT;

import java.util.Scanner;

import static java.lang.System.exit;

public class BankSystem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        BankSystemMT con = new BankSystemMT();
        double saldo = 0;
        int decisao = 0;

        while (decisao == 0) {
            System.out.println("Seja bem-vindo ao Banco, digite seu usuario e sua senha:");
            if (con.login(entrada.next(), entrada.next()) == true) {
                decisao = 1;
            } else {
                System.out.println("Usuario ou senha incorretos!");
                decisao = 0;
            }


            while (decisao == 1) {
                System.out.println(" ");
                System.out.println("=======Menu principal=======");
                System.out.println("Digite (2) para efetuar DEPOSITOS;");
                System.out.println("Digite (3) para efetuar SAQUES;");
                System.out.println("digite (4) para sair.");
                int menu = entrada.nextInt();
                if (menu == 2) {
                    decisao = 2;
                } else if (menu == 3) {
                    decisao = 3;
                } else if(menu == 4){
                    System.out.println("Encerrando aplicativo...");
                    exit(0);
                }else{
                    decisao = 1;
                }


                while (decisao == 2) {
                    System.out.println(" ");
                    System.out.println("=======DEPOSITO=======");
                    System.out.println("|| para voltar ao menu digite (1)|| ");
                    System.out.println("Seu saldo é de: " + saldo + ", digite o valor do DEPOSITO:");
                    double valorDeposito = entrada.nextDouble();

                    if(valorDeposito == 1){
                        decisao = 1;
                    }else if (con.confirmDeposito(valorDeposito) == false) {
                        System.out.println("Você só pode depositar valores acima de 5 reais!");
                        decisao = 2;
                    } else {
                        saldo += valorDeposito;
                        System.out.println("Seu deposito de: " + valorDeposito + ", foi concluído com sucesso seu saldo agora é de: " + saldo+ ".");
                        decisao = 2;
                    }
                }

                while (decisao == 3) {
                    System.out.println(" ");
                    System.out.println("=======SAQUE=======");
                    System.out.println("|| para voltar ao menu digite (1) ||");
                    System.out.println("Seu saldo é de: " + saldo + ", digite o valor do SAQUE:");
                    double valorSaque = entrada.nextDouble();

                    if(valorSaque == 1){
                        decisao = 1;
                    }else if (con.confirmSaque(valorSaque) == false){
                        System.out.println("Você só pode sacar valores acima de 5 reais!");
                        decisao = 3;
                    }else{
                        saldo -= valorSaque;
                        if (saldo < 0){
                            saldo += valorSaque;
                            System.out.println("Saldo insuficiente! Você possui o saldo de: " + saldo + ".");
                            decisao = 3;
                        }else if(saldo > 0){
                            System.out.println("Saque concluído com sucesso! seu saldo atual é de: "+ saldo + ".");
                            decisao = 3;
                        }
                    }
                }
            }
        }
    }
}
