package Q5_HashSet;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 5) Com conceitos de Coleção. Crie uma classe TesteHashSetCPF que possui um método main.  
a) Dentro do main crie um HashSet de String 
b) Adicione 10 CPF Strings informados pelo usuário (utilizando um laço de repetição) 
c) Digite alguns CPF repetidos e verifique o conteúdo do conjunto criado HashSet utilizando um 
for para percorrê-lo.
 */


 
 public class TesteHashSetCPF {
 
     public static void main(String[] args) {

         HashSet<String> cpfs = new HashSet<>();
         Scanner teclado = new Scanner(System.in);
 
         System.out.println("Digite 10 números de CPF:");
         for (int i = 0; i < 10; i++) {
             System.out.print("Digite o CPF " + (i + 1) + ": ");
             String cpf = teclado.nextLine();
             cpfs.add(cpf);  
         }
 
         System.out.println("\nCPFs:");
         for (String cpf : cpfs) {
             System.out.println(cpf);
         }
         
         teclado.close();
     }
 }
 
