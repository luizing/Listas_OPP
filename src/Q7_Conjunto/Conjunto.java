/*
 * 7. Escreva uma classe Conjunto, que represente um conjunto de tamanho variável (crescimento de array 
por demanda) de elementos do tipo String. Escreva os seguintes membros para a classe: 
 
a) Um método que permita adicionar um elemento para o conjunto (o elemento não pode existir no 
conjunto); 

b) Um método que permita verificar se um dado elemento pertence ao Conjunto; 

c) Um método uniao, que retorne um novo conjunto de acordo com a semântica da operação união 
entre  conjuntos  (um novo  conjunto,  sem  elementos  repetidos,  com  a  combinação  dos  elementos 
dos dois conjuntos originais, o que recebeu a mensagem e o que foi passado como parâmetro); 

d) Um  método  inter,  que  retorne  um  novo  conjunto  de  acordo  com  a  semântica  da  operação 
interseção  entre  conjuntos(um  novo  conjunto,  sem  elementos  repetidos,  com  os  elementos  que 
estejam  nos  dois  conjuntos  originais  ,o  que  recebeu  a  mensagem  e  o  que  foi  passado  como 
parâmetro); 
e) Um  método  menos,  que  retorne  um  novo  conjunto  de  acordo  com  a  semântica  da  operação 
subtração  entre  conjuntos  (um  novo  conjunto,  sem  elementos  repetidos,  com  os  elementos  do 
conjunto que recebeu a mensagem, e que não existam no conjunto passado como parâmetro).
 */

package Q7_Conjunto;

public class Conjunto {
    // Atributos
    String [] elementos;

    // Adicionar elemento
    public boolean adicionar(String novo){
        String [] novoArray = new String[elementos.length + 1]; // Cria novo array de tamanho +1
        for (int index = 0; index < elementos.length; index++){ // Itera sob o antigo array e testa se o elemento a ser adicionado pertence a ele, caso pertenca, add ao novo array
            if (elementos[index] == novo){
                return false;
            }
            novoArray[index] = elementos[index];
        }
        novoArray[novoArray.length - 1] = novo; //add o novo numero a ultima posicao do novo array
        this.elementos = novoArray;
        return true;
    }

    // Pertence ao conjunto
    public boolean isPertencente(String Alpha){
        for (int index = 0; index < elementos.length; index++){ 
            if (elementos[index] == Alpha){
                return true;
            }
        }
        return false;
    }

    // Uniao de conjuntos
    public Conjunto uniao(Conjunto B){
        String[] arrayMaxima = new String[this.elementos.length + B.elementos.length];
        
        // Adicionar todos os elementos de A(this) em arrayMaxima
        for (int index = 0; index < this.elementos.length; index++){ 
            arrayMaxima[index] = elementos[index];
            }
        
        // Adicionar os elementos de B em arrayMaxima checando se eles já existem
        int index = elementos.length;
        
        for (int indexB = 0; indexB < elementos.length; indexB++){ 
            if (!isPertencente(B.elementos[indexB])){ // Caso não pertença
                arrayMaxima[index + indexB] = B.elementos[indexB];
            }
        }

        // Para cortar os espaços vazios de arrayMax
        int indexC = 0;
        while (arrayMaxima[indexC] != null) {
            indexC ++;
        }
        String[] arrayFinal = new String[indexC + 1]; 
        for (int indexD = 0; indexD < arrayFinal.length; indexD++){
            arrayFinal[indexD] = arrayMaxima[indexD];
        }

        Conjunto uniao = new Conjunto();
        uniao.elementos = arrayFinal;

        return uniao;

        }

    }

