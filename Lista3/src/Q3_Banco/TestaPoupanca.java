package Q3_Banco;

/*3) Com conceitos de Interface Nosso banco precisa tributar dinheiro de alguns bens que nossos 
clientes possuem. Para isso, vamos criar um sistema para isso.  
a) Crie uma interface Tributável que possui o método calculaTributos(), que retorna um double.  
b)  Alguns  bens  são  tributáveis  e  outros  não,  ContaPoupanca  não  é  tributável,  já  para 
ContaCorrente você precisa pagar 1% da conta e o SeguroDeVida tem uma taxa fixa de 42 reais.  
c) As classes ContaCorrente e ContaPoupanca herdam de uma classe Conta. Essa classe Conta 
possui um saldo e os métodos sacar(double), depositar(double) e obterSaldo() que retorna o saldo 
da conta.  
d) Criar uma classe TestaTributavel com um método main para testar o nosso exemplo.   */

public class TestaPoupanca {
    public static void main(String[] args) {
        ContaCorrente Luiz = new ContaCorrente();
        ContaPoupanca Ed = new ContaPoupanca();

        System.out.println("LUIZ: ");
        Luiz.exibirSaldo();
        Luiz.depositar(200);
        Luiz.exibirSaldo();
        Luiz.sacar(30);
        Luiz.exibirSaldo();

        System.out.println("---------------");
        System.err.println("ED: ");

        Ed.exibirSaldo();
        Ed.depositar(10000);
        Ed.sacar(100);
        Ed.exibirSaldo();

        System.out.println("Tributo da conta luiz: " + Luiz.calculaTributos());
    }
}
