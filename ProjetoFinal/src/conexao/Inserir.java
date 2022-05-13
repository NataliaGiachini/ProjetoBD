package conexao;

import com.sun.jdi.connect.Connector;
import conexao.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Inserir {

    Conexao conn = new Conexao();

    public void analista(String nome) {
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement("INSERT INTO tb_analista(nome_analista)\n"
                    + "VALUES (?)");
            inserir.setString(1, nome);
            inserir.executeUpdate();
            System.out.println();
            System.out.println("---Cadastrado com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void contato(String nome, String telefone, String email) {
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement("INSERT INTO tb_contato(nome, telefone, email)\n"
                    + "VALUES (?,?,?)");
            inserir.setString(1, nome);
            inserir.setString(2, telefone);
            inserir.setString(3, email);
            inserir.executeUpdate();
            System.out.println();
            System.out.println("---Cadastrado com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void empresa(String razaoSocial, String cnpj, String telefone, String endereco, boolean ativo, int idContato) {
        try {
            PreparedStatement inserirEmpresa = conn.getConexao().prepareStatement("INSERT INTO tb_empresa(razao_social, cnpj, telefone, endereco, ativo, id_contato)\n"
                    + "VALUES (?,?,?,?,?,?)");
            inserirEmpresa.setString(1, razaoSocial);
            inserirEmpresa.setString(2, cnpj);
            inserirEmpresa.setString(3, telefone);
            inserirEmpresa.setString(4, endereco);
            inserirEmpresa.setBoolean(5, ativo);
            inserirEmpresa.setInt(6, idContato);
            inserirEmpresa.executeUpdate();
            System.out.println();
            System.out.println("---Empresa cadastrada com sucesso! :)---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void atendimento(String descricao, int id_emp, int id_ana) {
        try {
            PreparedStatement inserir = conn.getConexao().prepareStatement("INSERT INTO tb_atendimento(descricao, id_empresa, id_analista)\n"
                    + "VALUES (?,?,?)");
            inserir.setString(1, descricao);
            inserir.setInt(2, id_emp);
            inserir.setInt(3, id_ana);
            inserir.executeUpdate();
            System.out.println();
            System.out.println("---Cadastrado com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }
}
