/*
 * PROJETO FINAL DO CURSO #BoraSerTech - PROJETO DE DATABASE MYSQL
 */
package projetofinal;

import objetos.Analista;
import objetos.Atendimento;
import objetos.Contato;
import objetos.Empresa;
import conexao.Conexao;
import java.util.Scanner;

/**
 *
 * @author
 *
 * David Alexandre Stein da Silva Isadora da Silva Oliveira Natalia Giachini
 * Bachega
 *
 */
public class ProjetoFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Analista analista = new Analista();
        Contato contato = new Contato();
        Empresa empresa = new Empresa();
        Atendimento atendimento = new Atendimento();

        String op;
        String opMenu1;
        int menuAtendimento;
        int menuPrincipal;
        int menuEmpresa;
        int menuAnalista;
        int menuContato;
        int menuFinal;

        do {
            String opAtendimento;
            String opEmpresa;
            String opAnalista;
            String opContato;

            System.out.println("=====   MENU PRINCIPAL  =====");
            System.out.println("=====Selecione uma opção=====");
            System.out.println("1 - Atendimento");
            System.out.println("2 - Empresa");
            System.out.println("3 - Analista");
            System.out.println("4 - Contato");
            System.out.println("5 - Sair");
            menuPrincipal = scanner.nextInt();

            switch (menuPrincipal) {
                case 1:
                    do {
                        System.out.println("=====Selecione uma Opção=====");
                        System.out.println("1 - Cadastro de Atendimento");
                        System.out.println("2 - Listar Atendimentos");
                        System.out.println("3 - Deletar Atendimento");
                        System.out.println("4 - Atualizar os dados do Atendimento");
                        System.out.println("5 - Voltar ao menu principal");

                        menuAtendimento = scanner.nextInt();

                        switch (menuAtendimento) {
                            case 1:
                                atendimento.inserir();
                                break;
                            case 2:
                                atendimento.lista();
                                break;
                            case 3:
                                atendimento.deletar();
                                break;
                            case 4:
                                atendimento.atualizar();
                                break;
                            case 5:
                                System.out.println("Menu finalizado");
                                ;
                                break;
                            default:
                                System.out.println("Operação Invalida!!");
                        } // fecha switch menuAtendimento
                    } while (menuAtendimento != 5);
                    break; // break case 1

                case 2:
                    do {
                        System.out.println("=====Selecione uma Opção=====");
                        System.out.println("1 - Cadastro de Empresa");
                        System.out.println("2 - Listar Empresas");
                        System.out.println("3 - Deletar Empresa");
                        System.out.println("4 - Atualizar os dados da Empresa");
                        System.out.println("5 - Voltar ao menu principal");

                        menuEmpresa = scanner.nextInt();

                        switch (menuEmpresa) {
                            case 1:
                                empresa.inserir();
                                break;
                            case 2:
                                empresa.listar();
                                break;
                            case 3:
                                empresa.deletar();
                                break;
                            case 4:
                                empresa.atualizar();
                                break;
                            case 5:
                                System.out.println("Menu finalizado");
                                ;
                                break;
                            default:
                                System.out.println("Operação Invalida!!");
                        } // fecha switch menuEmpresa
                    } while (menuEmpresa != 5);
                    break; // break case 2

                case 3:
                    do {
                        System.out.println("===Selecione uma Opção===");
                        System.out.println("1 - Cadastrar Analista");
                        System.out.println("2 - Listar Analistas");
                        System.out.println("3 - Deletar Analista");
                        System.out.println("4 - Atualizar os dados do Analista");
                        System.out.println("5 - Voltar ao menu principal");

                        menuAnalista = scanner.nextInt();

                        switch (menuAnalista) {
                            case 1:
                                analista.inserir();
                                break;
                            case 2:
                                analista.lista();
                                break;
                            case 3:
                                analista.deletar();
                                break;
                            case 4:
                                analista.atualizar();
                                break;
                            case 5:
                                System.out.println("Menu finalizado");
                                ;
                                break;
                            default:
                                System.out.println("Operação Invalida!!");
                        } // fecha switch menuAnalista
                    } while (menuAnalista != 5);
                    break; // break case 3

                case 4:
                    do {
                        System.out.println("===Selecione uma Opção===");
                        System.out.println("1 - Cadastrar Contato");
                        System.out.println("2 - Listar Contatos");
                        System.out.println("3 - Deletar Contato");
                        System.out.println("4 - Atualizar os dados do Contato");
                        System.out.println("5 - Voltar ao menu principal");

                        menuContato = scanner.nextInt();

                        switch (menuContato) {
                            case 1:
                                contato.inserir();
                                break;
                            case 2:
                                contato.lista();
                                break;
                            case 3:
                                contato.deletar();
                                break;
                            case 4:
                                contato.atualizar();
                                break;
                            case 5:
                                System.out.println("Menu finalizado");
                                ;
                                break;
                            default:
                                System.out.println("Operação Invalida!!");
                        } // fecha switch menuContato
                    } while (menuContato != 5);
                    break; // break case 4

                case 5:
                    System.out.println("Tem certeza que deseja sair do sistema 1 - SIM | 2 - NAO?");
                    menuFinal = scanner.nextInt();

                    switch (menuFinal) {
                        case 1:
                            System.out.println("SISTEMA ENCERRADO!");
                            menuPrincipal = 6;
                            break;
                        case 2:
                            System.out.println("...");
                            break;
                        default:
                            System.out.println("Operação Invalida!!");
                    }//fecha switch menuFinal
                    break;

                default:
                    System.out.println("operacao invalida!!");
            } //fecha switch menuPrincipal

        } while (menuPrincipal != 6);
    }
}
