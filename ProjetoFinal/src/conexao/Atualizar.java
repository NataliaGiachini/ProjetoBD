package conexao;

import conexao.Conexao;
import java.sql.PreparedStatement;

public class Atualizar {

    Conexao conn = new Conexao();

    public void analista(String nome, int id) {
        try {
            PreparedStatement alterar = conn.getConexao().prepareStatement("UPDATE tb_analista SET nome_analista = ? WHERE ID_ANALISTA=?");
            alterar.setString(1, nome);
            alterar.setInt(2, id);
            alterar.executeUpdate();
            System.out.println();
            System.out.println("---Atualizado com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void contato(String nome, String telefone, String email, int id) {
        try {
            PreparedStatement alterar = conn.getConexao().prepareStatement("UPDATE tb_contato SET nome=?, telefone=?, email=?\n"
                    + "WHERE id_contato=?");
            alterar.setString(1, nome);
            alterar.setString(2, telefone);
            alterar.setString(3, email);
            alterar.setInt(4, id);
            alterar.executeUpdate();
            System.out.println();
            System.out.println("---Cadastrado com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void empresa(String razaoSocial, String cnpj, String telefone, String endereco, boolean ativo, int idContato, int idempresa) {
        
        try {
            PreparedStatement alterar = conn.getConexao().prepareStatement("UPDATE tb_empresa SET razao_social=?, cnpj=?, telefone=?, endereco=?, ativo=?, id_contato=? WHERE id_empresa =?");
            alterar.setString(1, razaoSocial);
            alterar.setString(2, cnpj);
            alterar.setString(3, telefone);
            alterar.setString(4, endereco);
            alterar.setBoolean(5, ativo);
            alterar.setInt(6, idContato);
            alterar.setInt(7, idempresa);            
            alterar.executeUpdate();
            System.out.println();
            System.out.println("---Empresa atualizada com sucesso! :)---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void atendimento(String descricao, int num_atend) {
        try {
            PreparedStatement alterar = conn.getConexao().prepareStatement("UPDATE tb_atendimento SET descricao = ? WHERE num_atendimento = ?");
            alterar.setString(1, descricao);
            alterar.setInt(2, num_atend);
            alterar.executeUpdate();
            System.out.println();
            System.out.println("---Atualizado com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }
}
