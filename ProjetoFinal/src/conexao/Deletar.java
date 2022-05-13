package conexao;

import conexao.Conexao;
import java.sql.PreparedStatement;

public class Deletar {

    Conexao conn = new Conexao();

    public void analista(int codigo_analista) {
        try {
            PreparedStatement deletar = conn.getConexao().prepareStatement("DELETE FROM tb_analista WHERE id_analista = ?");
            deletar.setInt(1, codigo_analista);
            deletar.executeUpdate();
            System.out.println();
            System.out.println("---Excluido com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void contato(int codigo_contato) {
        try {
            PreparedStatement deletar = conn.getConexao().prepareStatement("DELETE FROM tb_contato WHERE id_contato = ?");
            deletar.setInt(1, codigo_contato);
            deletar.executeUpdate();
            System.out.println();
            System.out.println("---Excluido com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void empresa(int idEmpresa) {
        try {
            PreparedStatement deletar = conn.getConexao().prepareStatement("DELETE FROM tb_empresa WHERE id_empresa =?");
            deletar.setInt(1, idEmpresa);
            deletar.executeUpdate();
            System.out.println();
            System.out.println("---Empresa excluída com sucesso! :)---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }

    public void atendimento(int num_atend) {
        String sql = "DELETE FROM tb_atendimento WHERE num_atendimento = (' " + num_atend + "')";
        try {
            PreparedStatement deletar = conn.getConexao().prepareStatement("DELETE FROM tb_atendimento WHERE num_atendimento =?");
            deletar.setInt(1, num_atend);
            deletar.executeUpdate();
            System.out.println();
            System.out.println("---Excluido com sucesso!!!---");
            System.out.println();
        } catch (Exception e) {
            System.out.println("---Erro ao executar o comando:---" + e);
        }
    }
}
