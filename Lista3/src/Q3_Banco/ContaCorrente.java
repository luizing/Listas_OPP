package Q3_Banco;

/*
 * c) As classes ContaCorrente e ContaPoupanca herdam de uma classe Conta. Essa classe Conta 
possui um saldo e os métodos sacar(double), depositar(double) e obterSaldo() que retorna o saldo 
da conta
 */

public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        //1% da conta e uma taxa fixa de 42 reais.  
        return (this.saldo / 100) + 42;
    }
    
}
