/*
 * 2) Com conceitos de Interface. Faça o que pede a questão.  
a) Crie um projeto interfaces e crie a interface AreaCalculavel com o método calculaArea() - sem 
parâmetros e que retorna um double. 
b) Criar algumas classes que implementam AreaCalculavel:  
I. Quadrado: possui um atributo lado.  
II. Retângulo: possui os atributos base e altura.  
III. Círculo: possui o atributo raio.  
c) Crie uma classe de Teste. No método main crie um vetor de 5 posições que contém alguns 
objetos do tipo AreaCalculavel. Logo após, percorra esse vetor imprimindo a área de cada objeto. 
 */

 public class Q2_main {
    public static void main(String[] args) {
        AreaCalculavel [] array = new AreaCalculavel[5];
        Quadrado Q = new Quadrado(4);
        array[0] = Q;
        Circulo C = new Circulo(3);
        array[1] = C;
        Retangulo R = new Retangulo(1, 2);
        array[2] = R;
        Quadrado Q2 = new Quadrado(5);
        array[3] = Q2;
        Circulo C2 = new Circulo(6);
        array[4] = C2;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Area = " + array[i].calculaArea());
        }
        

    }
 }