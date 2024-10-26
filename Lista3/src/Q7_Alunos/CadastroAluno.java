/*
 * 7) Com conceitos de Coleção. Crie uma classe Aluno que possui os atributos matrícula, nome, ira e curso 
nessa mesma classe crie um construtor que receba valores como parâmetro para cada atributo da classe. 
a) Crie uma classe CadastroAluno que possui uma lista como atributo 
b) Adicione métodos para adicionar novos Alunos, outro para ordenar a lista através da matricula 
dos alunos e outro para imprimir os elementos presentes na lista; 
c) Crie o método main para executar a classe, nele vocês devem digitar os dados de 10 Alunos, 
ordenar e imprimir a lista (usando os métodos criados);
 */

package Q7_Alunos;

import java.util.ArrayList;
import java.util.Comparator;

public class CadastroAluno {
    ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno novoAluno){
        listaAlunos.add(novoAluno);
    }
    
    public void ordenarPorMatricula() {
        listaAlunos.sort(Comparator.comparingInt(Aluno::getMatricula));
    }

    public void listarAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.getNome());
        }
    }

    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();

        cadastro.adicionarAluno(new Aluno(101, "Alice", 8.5, "Engenharia"));
        cadastro.adicionarAluno(new Aluno(102, "Bruno", 7.8, "Medicina"));
        cadastro.adicionarAluno(new Aluno(103, "Carlos", 9.0, "Direito"));
        cadastro.adicionarAluno(new Aluno(104, "Daniela", 6.5, "Arquitetura"));
        cadastro.adicionarAluno(new Aluno(105, "Eduardo", 8.0, "Engenharia"));
        cadastro.adicionarAluno(new Aluno(106, "Fernanda", 9.5, "Computação"));
        cadastro.adicionarAluno(new Aluno(107, "Gabriel", 7.2, "Psicologia"));
        cadastro.adicionarAluno(new Aluno(108, "Helena", 8.9, "Biologia"));
        cadastro.adicionarAluno(new Aluno(109, "Isabela", 6.8, "Administração"));
        cadastro.adicionarAluno(new Aluno(110, "João", 7.5, "Economia"));

        System.out.println("\n--- Alunos Desordenados ---");
        cadastro.listarAlunos();

        System.out.println("\n--- Alunos Ordenados ---");
        cadastro.ordenarPorMatricula();
        cadastro.listarAlunos();
    }


    
}
