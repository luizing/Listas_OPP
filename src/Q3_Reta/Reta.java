/*
 * 3. Escreva em Java uma classe que represente uma reta (𝑦=𝑎𝑥+𝑏). Forneça os seguintes membros de 
classe: 
a) Construtores que criem uma reta a partir de: 
i. Dois valores, representando o coeficiente angular e o coeficiente linear da reta; 
ii. Dois pontos; 

b) Métodos de acesso para o coeficiente angular e para o coeficiente linear da reta; 

c) Um método que verifique se um ponto dado pertence a reta; 

d) Um  método  que  dada  uma  outra  reta,  retorne  o  ponto  de  interseção  da  reta  dada  ou  null  se  as 
retas forem paralelas. 
 */

package Q3_Reta;

import Q2_PontosCatersianos.ponto2d;

public class Reta {
    // Atributos
    double coefAngular, coefLinear;

    // Costrutores
    public Reta(double coefAngular, double coefLinear){
        this.coefAngular = coefAngular;
        this.coefLinear = coefLinear;
    }

    public Reta(ponto2d A, ponto2d B){
        this.coefAngular = ((A.getCordY()- B.getCordY()) / (A.getCordX() - B.getCordX())); //coeficiente angular = (y₂ - y₁)/(x₂ - x₁)
        this.coefLinear =A.getCordY() / (getCoefAngular() * A.getCordX()); //y = mx + n [sendo m o coef angular]
    }

    // Setters
    public void setCoefAngular(double coefAngular){
        this.coefAngular = coefAngular;
    }
    public void setCoefLinear(double coefLinear){
        this.coefLinear = coefLinear;
    }

    // Getters
    public double getCoefAngular(){
        return this.coefAngular;
    }
    public double getCoefLinear(){
        return this.coefLinear;
    }

    // Ponto na reta?
    public boolean pontoPertence(ponto2d ponto){
        return (ponto.getCordY() == getCoefAngular() * ponto.getCordX() + getCoefLinear()); //Equação da reta (y=ax+B) substituindo valores de x e y pelo do ponto
    }

    // Ponto de intersecção -> Caso de serem a mesma reta*
    public ponto2d pontoInterseccao(Reta b){

        double x = (b.getCoefLinear() - getCoefLinear()) / (b.getCoefAngular() + getCoefAngular());

        if (getCoefAngular() * x + getCoefLinear() == b.getCoefAngular() * x + getCoefLinear()){
            double y = getCoefAngular() * x + getCoefLinear();
            ponto2d interceccao = new ponto2d(x,y);
            return interceccao;
        }
        else{
            return null;
        }
    }
}


    // Interccecao entre retas:
        //y = ax +  b
        //R1.y = R1.coefA * R1.x + R1.coefL
        //assume y1 = y2,
        //R1.coefA * X + R1.coefL = R2.coefA * X + R2.coefL
        //R1.coefA * X + R2.coefA * X = R2.coefL - R1.coefL
        //X(R1.coefA + R2.coefL) = R2.coefL - R1.coefL
        //X = (R2.coefL - R1.coefL) / (R1.coefA + R2.coefL)
        //
        //y1 = R1.coefA * X + R1.coefL
        //y2 = R2.coefA * X + R2.coefL
        //If y1 = y2, return (X,Y) else return Null