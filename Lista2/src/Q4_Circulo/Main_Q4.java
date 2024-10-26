import Q2_PontosCatersianos.ponto2d;

public class Main_Q4 {
    
    public static void main(String[] args) {
        ponto2d O = new ponto2d(5,5);

        Circulo a = new Circulo(10);
        Circulo b = new Circulo(0,O);

        System.out.println(a.area());
        System.out.println(b.area());
    }
}
