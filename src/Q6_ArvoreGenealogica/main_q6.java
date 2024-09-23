package Q6_ArvoreGenealogica;

public class main_q6 {
    public static void main(String[] args) {
        Pessoa marcia = new Pessoa("Marcia");
        Pessoa carlos = new Pessoa("Carlos");
        Pessoa luiz = new Pessoa("Luiz", marcia, carlos);
        Pessoa eduardo = new Pessoa("Luiz", marcia, carlos);
        Pessoa gabriel = new Pessoa("Gabriel");

        System.out.println("Luiz é a mesma pessoa que Eduardo: " + luiz.isEqual(eduardo));
        System.out.println("Luiz é a mesma pessoa que Gabriel: " + luiz.isEqual(gabriel));


    }
}
