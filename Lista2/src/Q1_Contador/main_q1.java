/*1. Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de itens ou
eventos. A classe deve oferecer métodos que devem:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador.
 */

 package Q1_Contador;

public class main_q1 {
    public static void main(String[] args) {
        
        // contar valores até N
        int N = 10;

        contador X = new contador();
        
        X.zerar();
        
        while (X.getValor() < N) {
            System.out.println(X.valor);
            X.incrementar();    
            }
    }
}
