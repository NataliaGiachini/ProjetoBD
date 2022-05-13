package objetos;

import conexao.Atualizar;
import conexao.Deletar;
import conexao.Inserir;
import conexao.Lista;

import java.util.Scanner;

public class Atendimento {

    Scanner scanner = new Scanner(System.in);

    private String descricao;
    private int id_emp;
    private int id_ana;

    public void inserir() {
        Inserir inserir = new Inserir();
        System.out.println("=====REGISTRO DE ATENDIMENTO=====");
        System.out.print("Descrição do chamado: ");
        this.descricao = scanner.nextLine().toUpperCase();
        System.out.print("Insira o ID da empresa: ");
        this.id_emp = scanner.nextInt();
        System.out.print("Insira o ID do analista: ");
        this.id_ana = scanner.nextInt();
        inserir.atendimento(descricao, id_emp, id_ana);
    }

    public void lista() {
        Lista lista = new Lista();
        lista.atendimento();
    }

    public void deletar() {
        Deletar deletar = new Deletar();
        System.out.print("Informe o numero do atendimento a ser excluido?");
        int num_atend = scanner.nextInt();
        deletar.atendimento(num_atend);
    }

    public void atualizar() {
        Atualizar atualizar = new Atualizar();
        System.out.print("Informe o número do atendimento a ser atualizado?");
        int num_atend = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Insira a nova descrição: ");
        String descricao = scanner.nextLine().toUpperCase();
        atualizar.atendimento(descricao, num_atend);
    }   
    
}
