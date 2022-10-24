package Methods;

public class TrianguloSystemMT {
    public String triangulo(double l1, double l2, double l3){
        String nometriangulo = "não identificado.";
        if(l1 == l2 || l1 == l3 || l2 == l3){
            nometriangulo = "Isósceles";
        }else if(l1 == l2 && l1 == l3){
            nometriangulo = "Equilátero";
        }else{
            nometriangulo = "Escaleno";
        }
        return nometriangulo;
    }
}
