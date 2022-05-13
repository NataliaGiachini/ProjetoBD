package objetos;

import conexao.Atualizar;
import conexao.Deletar;
import conexao.Inserir;
import conexao.Lista;

import java.util.Scanner;

public class Empresa {

    Scanner scanner = new Scanner(System.in);

    private int idEmpresa;
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String endereco;
    private int ativo;
    private boolean status;
    private int idContato;

    public void inserir() {

        System.out.println("=====CADASTRO DE EMPRESA=====");
        System.out.print("Digite a Razão Social da Empresa: ");
        this.razaoSocial = scanner.nextLine().toUpperCase();
        System.out.print("Digite o CNPJ da Empresa (apenas números): ");
        this.cnpj = scanner.nextLine().toUpperCase();
        System.out.print("Digite o Telefone da Empresa (apenas números): ");
        this.telefone = scanner.nextLine();
        System.out.print("Digite o Endereço da Empresa: ");
        this.endereco = scanner.nextLine().toUpperCase();
        System.out.print("Empresa ativa? 1 para SIM  - 0 para NAO ");
        this.ativo = scanner.nextInt();
        if (ativo == 1) {
            this.status = true;
        } else {
            this.status = false;
        }
        System.out.print("Digite o ID do contato da Empresa: ");
        this.idContato = scanner.nextInt();
        Inserir inserir = new Inserir();
        inserir.empresa(razaoSocial, cnpj, telefone, endereco, status, idContato);
    }

    public void listar() {
        Lista listar = new Lista();
        listar.empresa();
    }

    public void deletar() {
        Deletar deletar = new Deletar();
        System.out.print("Informe o codigo da Empresa a ser excluída: ");
        int idEmpresa = scanner.nextInt();
        deletar.empresa(idEmpresa);
    }

    public void atualizar() {
        Atualizar atualizar = new Atualizar();
        System.out.print("Informe o ID da Empresa a ser atualizada:");
        idEmpresa = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Informe a Razão Social: ");
        this.razaoSocial = scanner.nextLine().toUpperCase();
        System.out.print("Informe o CNPJ (apenas números): ");
        this.cnpj = scanner.nextLine().toUpperCase();
        System.out.print("Informe o Telefone (apenas números): ");
        this.telefone = scanner.nextLine().toUpperCase();
        System.out.print("Informe o Endereço: ");
        this.endereco = scanner.nextLine().toUpperCase();
        System.out.print("Empresa ativa? 1 para SIM  - 0 para NAO: ");
        this.ativo = scanner.nextInt();
        if (ativo == 1) {
            this.status = true;
        } else {
            this.status = false;
        }
        System.out.print("Informe o ID do Contato: ");
        this.idContato = scanner.nextInt();
        atualizar.empresa(razaoSocial, cnpj, telefone, endereco, status, idContato, idEmpresa);

    }

}
