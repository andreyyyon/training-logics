package Methods;

public class BankSystemMT {

    public boolean login(String nome, String senha) {
        if (nome.equals("usuario") && senha.equals("1234")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean confirmDeposito(double x) {
        if (x > 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean confirmSaque(double x) {
        if (x > 5) {
            return true;
        } else {
            return false;
        }
    }
}