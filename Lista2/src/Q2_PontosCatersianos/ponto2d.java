/*
 2. Escreva em Java uma classe Ponto2D que represente um ponto no plano cartesiano. Além dos
atributos por você identificados, a classe deve oferecer os seguintes membros:
a) Construtores que permitam a inicialização do ponto:
i. Por default (sem parâmetros) na origem do espaço 2D;
ii. Num local indicado por dois parâmetros do tipo double (indicando o valor de abcissa e
ordenada do ponto que está sendo criado);
iii. Em um local indicado por outro ponto.

b) Métodos de acesso (getter/setter) dos atributos do ponto;

c) Método de comparação semântica do ponto (equals);

d) Método que permita calcular a distância do ponto que recebe a mensagem, para outro ponto
 */

package Q2_PontosCatersianos;

public class ponto2d {
    
    // Atributos
    double cordX, cordY;

    // Construtores
    public ponto2d(){
        this.cordX = 0;
        this.cordY = 0;
    } 
    public ponto2d(double cordX, double cordY){
        this.cordX = cordX;
        this.cordY = cordY;
    } 
    public ponto2d(ponto2d Ponto){
        this.cordX = Ponto.cordX;
        this.cordY = Ponto.cordY;
    } 

    // Getters
    public double getCordX() {
        return cordX;
    }
    public double getCordY() {
        return cordY;
    }

    // Setters
    public void setCordX(double cordX) {
        this.cordX = cordX;
    }
    public void setCordY(double cordY) {
        this.cordY = cordY;
    }

    // Comparação Semantica
    public boolean comparação(ponto2d Outro){
        return this.cordX == Outro.cordX && this.cordY == Outro.cordY;
    }
    /*
    Código alternativo
     if (this.cordX == Outro.cordX && this.cordY == Outro.cordY) {
            return true;
        }
        else{
            return false;
        } 
     */

    // Calcular distancia
    public double calcDistancia(ponto2d Outro){
        return Math.sqrt(Math.pow(this.cordX - Outro.cordX, 2) + Math.pow(this.cordY - Outro.cordY, 2));
        }

    // Mostrar Cordenadas
    public void mostrarCoords(){
        System.out.println("X = " + this.cordX + " Y = " + this.cordY);
    }

}
