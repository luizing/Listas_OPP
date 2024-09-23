package Q2_PontosCatersianos;

public class Main_q2 {
    public static void main(String[] args) {
        ponto2d a = new ponto2d();
        System.out.println("Cordenadas de a");
        a.mostrarCoords();
        
        ponto2d b = new ponto2d(5,2);
        System.out.println("Cordenadas de b");
        b.mostrarCoords();

        ponto2d c = new ponto2d(b);
        System.out.println("Cordenadas de c");
        c.mostrarCoords();

        System.out.println("a comparado com b");
        System.out.println(a.comparação(b));

        System.out.println("b comparado com c");
        System.out.println(b.comparação(c));

        System.out.println("Distancia de a para c");
        System.out.println(a.calcDistancia(c));
    }
}
