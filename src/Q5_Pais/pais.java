/*
 * 5. Escreva uma classe que represente um país. Um país é representado através dos atributos: código ISO 
3166-1 (ex.: BRA), nome (ex.: Brasil), população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.: 
8.515.767,049).  Além  disso,  cada  país  mantém  uma  lista  de  outros  países  com  os  quais  ele  faz 
fronteira. Escreva a classe em Java e forneça os seus membros a seguir: 
a) Construtor que inicialize o código ISO, o nome e a dimensão do país; 
b) Métodos de acesso (getter/setter) para as propriedades código ISSO, nome, população e 
dimensão do país; 
c) Um método que permita verificar se dois objetos representam o mesmo país (igualdade 
semântica). Dois países são iguais se tiverem o mesmo código ISO; 
d) Um método que retorne a densidade populacional do país;
 */


package Q5_Pais;

public class pais {
    // Atributos
    String iso;
    String nome;
    int populacao;
    float dimensao;
    String[] fronteira;

    // Contrutores
    public pais(String iso, String nome, float dimensao){
        this.iso = iso;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    // Setters
    public void setIso(String iso){
        this.iso = iso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPopulacao(int populacao){
        this.populacao = populacao;
    }
    public void setDimensao(float dimensao){
        this.dimensao = dimensao;
    }
    public void setFronteira(String[] fronteira){
        this.fronteira = fronteira;
    }

    // Getters
    public String getIso(){
        return this.iso;
    }
    public String getNome(){
        return this.nome;
    }
    public int getPopulaca(){
        return this.populacao;
    }
    public float getDimensao(){
        return this.dimensao;
    }
    public String[] getFronteira(){
        return this.fronteira;
    }

    // Igualdade Semantica
    public boolean isEqual(pais comparado){
        return this.iso == comparado.iso;
    }

    // Densidade Populacional (numPessoas/DimensaoKm2)
    public float densidadePopulacional(){
        return populacao/dimensao;
    }

    // Printar fronteiras
    public void printarFronteiras(){
        for (int iterador = 0; iterador < fronteira.length ; iterador++){
            System.out.println(fronteira[iterador]);
        }
    }


}

