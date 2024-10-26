package Q2_Areas;

public class Quadrado implements AreaCalculavel {
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return Math.pow(lado, 2);
    }

}
