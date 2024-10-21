/*4) Com conceitos de Coleção. Crie uma classe Círculo que possua o atributo raio,  adicione um método 
para calcular a área do círculo e retornar esse valor, utilizando a seguinte fórmula área π raio²(questao2). Escreva 
um programa Java que crie 5 objetos Círculo de tamanhos diferentes, insira os em uma lista e depois 
percorra a lista imprimindo a área de cada círculo armazenado. */
package Q4_;
import java.util.*;



import Q2_Areas.Circulo;

public class main {
    Circulo A = new Circulo(3);
    Circulo B = new Circulo(5);
    Circulo C = new Circulo(4);
    Circulo D = new Circulo(10);
    Circulo E = new Circulo(1);

    ArrayList<Circulo> lista = new ArrayList<Circulo>();

    lista.add(A);

}
