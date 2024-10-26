package Q7_Conjunto;

public class main_q7 {
    public static void main(String[] args) {
        Conjunto Pares = new Conjunto();
        Conjunto Impares = new Conjunto();
        Conjunto MenoresCinco = new Conjunto();

        // Adicionando elementos
        for (int i = 0; i < 11; i += 2){
            Pares.adicionar(String.valueOf(i));
        }
        for (int i = 1; i < 11; i += 2){
            Impares.adicionar(String.valueOf(i));
        }
        for (int i = 1; i < 6; i ++){
            MenoresCinco.adicionar(String.valueOf(i));
        }

        Pares.printElementos();

        // Tentando adicionar elementos repetidos
        System.out.println("Adicionar 6: " + Pares.adicionar(String.valueOf(6)));
        System.out.println("Adicionar 12: " + Pares.adicionar(String.valueOf(12)));

        System.out.println("12 pertence a Pares: " + Pares.isPertencente((String.valueOf(12))));
        System.out.println("5 pertence a Pares: " + Pares.isPertencente((String.valueOf(5))));
    
        // Uniao de pares e impares
        Conjunto Numeros = Pares.uniao(Impares);
        Conjunto ParesMenoresCinco = Pares.inter(MenoresCinco);
        Conjunto MaioresCinco = Numeros.menos(MenoresCinco);

        // Printar elementos
        Numeros.printElementos();
        ParesMenoresCinco.printElementos();
        MaioresCinco.printElementos();


    }
}
