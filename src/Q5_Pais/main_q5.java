package Q5_Pais;

public class main_q5 {
    public static void main(String[] args) {
        pais Brasil = new pais("BRA","Brasil",10000);
        pais Argentina = new pais("ARG","Argentina",5000);
        pais China = new pais("CHN","China",200000);
        pais brasil = new pais("BRA", "brasil", 100);
    
        China.setPopulacao(83423);
 
        System.out.printf("Densidade populacional da China: %f" ,China.densidadePopulacional());
        System.out.println("\nBrasil é igual a brasil? " + Brasil.isEqual(brasil));
    
        String[] fronteiras_ARG = {"Brasil","Chile"};
        Argentina.setFronteira(fronteiras_ARG);
        Argentina.printarFronteiras();
        
    }
}
