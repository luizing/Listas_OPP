package Q2_Areas;

public class Circulo implements AreaCalculavel {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
