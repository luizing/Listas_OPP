package Q1_Contador;

public class contador {
    int valor;

    // getter e setter
    int getValor(){
        return valor;
    }

    void setValor(int Valor){
        this.valor = Valor;
    }

    // métodos
    void zerar(){
        setValor(0);
    }

    void incrementar(){
        setValor(this.valor + 1);
    }





}
