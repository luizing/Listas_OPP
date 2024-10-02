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
    String [] elementos = new String[0];    

    // Adicionar elemento
    public boolean adicionar(String novo){
        String [] novoArray = new String[elementos.length + 1]; // Cria novo array de tamanho +1
        for (int index = 0; index == elementos.length; index++){ // Itera sob o antigo array e testa se o elemento a ser adicionado pertence a ele, caso pertenca, add ao novo array
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

        public Conjunto inter(Conjunto B){
            // Cria uma nova array com o tamanho do menor dos conjuntos
            int intersecTamanho;
            if (this.elementos.length > B.elementos.length) {
                intersecTamanho = B.elementos.length;
            }
            else{
                intersecTamanho = this.elementos.length;
            }
            String[] intersecElementos = new String[intersecTamanho];
        
            // Comparar elementos de A e B e adicionar a intersecElementos aqueles que pertecem aos 2 conjuntos
            int indexB = 0;
            for (int index = 0; index < B.elementos.length; index++){ 
                if (isPertencente(B.elementos[index])){ 
                    intersecElementos[indexB] = B.elementos[index];
                    indexB++;
                }
            }

            // Para cortar os espaços vazios 
            int indexC = 0;
            while (intersecElementos[indexC] != null) {
                indexC ++;
            }
            String[] arrayFinal = new String[indexC + 1]; 
            for (int indexD = 0; indexD < arrayFinal.length; indexD++){
                arrayFinal[indexD] = intersecElementos[indexD];
            }

            Conjunto intersec = new Conjunto();
            intersec.elementos = arrayFinal;

            return intersec;

        }

        public Conjunto menos(Conjunto B){
            // Cria uma nova array
            String[] menosElementos = new String[this.elementos.length];
        
            // Comparar elementos de A e B e adicionar a intersecElementos aqueles que pertecem a this e não a B
            int indexB = 0;
            for (int index = 0; index < this.elementos.length; index++){ 
                if (!B.isPertencente(this.elementos[index])){ 
                    menosElementos[indexB] = this.elementos[index];
                    indexB++;
                }
            }

            // Para cortar os espaços vazios 
            int indexC = 0;
            while (menosElementos[indexC] != null) {
                indexC ++;
            }
            String[] arrayFinal = new String[indexC + 1]; 
            for (int indexD = 0; indexD < arrayFinal.length; indexD++){
                arrayFinal[indexD] = menosElementos[indexD];
            }

            Conjunto menos = new Conjunto();
            menos.elementos = arrayFinal;

            return menos;
        }

        // Mostrar elementos
        public void printElementos(){
            for (int i = 0; i < elementos.length; i++)
            System.out.println(elementos[i]);
        }

    }

