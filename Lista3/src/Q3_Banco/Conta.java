public class Conta {

    double saldo;

    public void sacar(double saque){
        this.saldo = saldo - saque;
    }
    
    public void depositar(double deposito){
        this.saldo = saldo + deposito;
    }

    public double obterSaldo(){
        return this.saldo;
    }

    public void exibirSaldo(){
        System.out.println("Saldo da conta: " + this.saldo);
    }
}