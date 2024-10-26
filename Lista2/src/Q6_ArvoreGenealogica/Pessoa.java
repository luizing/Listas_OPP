/*
 * 6. Escreva uma classe Pessoa que representa uma pessoa numa árvore genealógica. A pessoa possui um 
nome, um pai e uma mãe (que também são pessoas). Forneça os seguintes membros para a classe:  
a) Construtores que: 
i) inicialize o nome da pessoa, bem como seus antecessores (pai e mãe); 
ii) inicialize o nome da pessoa, e coloque seus antecessores para null; 
b) Um  método  que  verifique  a  igualdade  semântica  entre  duas  pessoas  (as  pessoas  são  iguais  se 
possuem o mesmo nome e a mesma mãe);
 */

package Q6_ArvoreGenealogica;

public class Pessoa {
    // Atributos
    String nome;
    Pessoa pai, mae;

    // Construtores
    public Pessoa(String nome, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }
    public Pessoa(String nome){
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;   
    }
    public void setPai(Pessoa pai){
        this.pai = pai;    
    }
    public void setMae(Pessoa mae){
        this.mae = mae;
    }

    // Getters
    public String getNome(){
        return this.nome;
    }
    public Pessoa getPai(){
        return this.pai;
    }
    public Pessoa getMae(){
        return this.mae;
    }

    // Igualdade semantica (nomes e maes iguais)
    public boolean isEqual(Pessoa comparada){
        return this.getNome() == comparada.getNome() && this.getMae() == comparada.getMae();
    }
}
