/*
 * Escreva em Java uma classe que represente um circulo no plano cartesiano. Forneça os seguintes
membros de classe:
a) Um construtor que receba o raio e um ponto (o centro do círculo);
b) Um construtor que receba o raio e posicione o círculo na origem do espaço cartesiano;
c) Métodos de acesso ao atributo raio do círculo;
d) Métodos inflar e desinflar, que, respectivamente, aumentam e diminuem o raio do círculo de um
dado valor;
e) Método que retorna a área do círculo
 */

import Q2_PontosCatersianos.ponto2d;

public class Circulo {
// Atributos
    ponto2d centro;
    float raio;

// Construtores
    public Circulo(float raio, ponto2d centro){
        this.centro = centro;
        this.raio = raio;
    }
    public Circulo(float raio){
        this.centro = new ponto2d();
        this.raio = raio;
    }

// Setters
    public void setCentro(ponto2d centro){
        this.centro = centro;
    }
    public void setRaio(float raio){
        this.raio = raio;
    }

// Getters
    public ponto2d getCentro(){
        return this.centro;
    }
    public float getRaio(){
        return this.raio;
    }

// Metodos do raio
    public void inflar(float x){
        setRaio(getRaio() + x);
    }
    public void desinflar(float x){
        setRaio(getRaio() - x);
    }

// Calculos sob a circunferencia
    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }
}