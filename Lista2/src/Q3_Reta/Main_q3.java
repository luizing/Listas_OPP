package Q3_Reta;

import Q2_PontosCatersianos.ponto2d;

public class Main_q3 {
    public static void main(String[] args) {

        ponto2d A = new ponto2d(10,10);
        ponto2d B = new ponto2d(5,12);
        ponto2d C = new ponto2d(1,4);
        
        
        Reta a = new Reta(3, 2);
        Reta b = new Reta(A, B);
        
        System.out.println("Ponto C pertence a C: " + b.pontoPertence(C));
        System.out.printf("Ponto de intercção entre a e b: (%.1f; %.1f)",a.pontoInterseccao(a).getCordX(), a.pontoInterseccao(a).getCordY());
    
    }
}
