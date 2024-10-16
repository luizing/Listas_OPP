public class Retangulo implements AreaCalculavel{
    double base, altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this. altura = altura;
    }

    @Override
    public double calculaArea(){
        return base * altura;
    }
}
