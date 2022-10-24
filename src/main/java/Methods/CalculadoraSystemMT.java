package Methods;

public class CalculadoraSystemMT {
    public void operador(int n1, String op, int n2) {
        if (op.equals("+")) {
            System.out.println(n1 + n2);
        } else if (op.equals("-")) {
            System.out.println(n1 - n2);
        } else if (op.equals("*")) {
            System.out.println(n1 * n2);
        } else if (op.equals("/")) {
            System.out.println(n1 / n2);
        }
    }
}
