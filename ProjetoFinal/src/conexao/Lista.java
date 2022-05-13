package conexao;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Util;

public class Lista {

    Conexao acesso = new Conexao();
    Util util = new Util();
    
    String status;

    public void analista() {
        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement("SELECT * FROM tb_analista");
            ResultSet resultado = pesquisa.executeQuery();
            System.out.println("----------------------------------------");
            System.out.println("ANALISTA CADASTRADOS");
            System.out.println("----------------------------------------");
            System.out.println("CÓDIGO   - NOME");   
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("id_analista"));
                String nome = resultado.getString("nome_analista");
                System.out.println("  " + codigo + "      - " + util.preencheComEspaco(nome, " ", 25, 1));
            }
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }

    public void contato() {
        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement("SELECT * FROM tb_contato");
            ResultSet resultado = pesquisa.executeQuery();
            System.out.println("----------------------------------------");
            System.out.println("CONTATOS CADASTRADOS");
            System.out.println("----------------------------------------");
            System.out.println("CÓDIGO    - NOME              - TELEFONE     - E-MAIL");
            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("id_contato"));
                String nome = resultado.getString("nome");
                String telefone = resultado.getString("telefone");
                String email = resultado.getString("email");
                System.out.println("   " +codigo + "      - " + util.preencheComEspaco(nome, " ", 17, 1)
                        + " - " + util.preencheComEspaco(telefone, " ", 12, 1)
                        + " - " + util.preencheComEspaco(email, " ", 25, 1));
            }
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }

    public void empresa() {
        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement("SELECT * FROM tb_empresa");
            ResultSet resultado = pesquisa.executeQuery();
            System.out.println("----------------------------------------");
            System.out.println("EMPRESAS CADASTRADAS");
            System.out.println("----------------------------------------");
            System.out.println("CÓDIGO - STATUS     - RAZÃO SOCIAL      - CNPJ           - TELEFONE"
             + "     - RUA");

            while (resultado.next()) {
                int codigo = Integer.parseInt(resultado.getString("id_empresa"));
                String razaoSocial = resultado.getString("razao_social");
                String cnpj = resultado.getString("cnpj");
                String telefone = resultado.getString("telefone");
                String endereco = resultado.getString("endereco");
                boolean ativo = resultado.getBoolean("ativo");
                int idContato = Integer.parseInt(resultado.getString("id_contato"));
                
                if(ativo){
                    this.status = "ATIVO";
                }else{
                    this.status = "INATIVO";
                }
                        
                System.out.println("  " + codigo + "    - " + util.preencheComEspaco(status, " ", 8, 1)+ "   - " + util.preencheComEspaco(razaoSocial, " ", 17, 1)
                        + " - " + util.preencheComEspaco(cnpj, " ", 14, 1)
                        + " - " + util.preencheComEspaco(telefone, " ", 12, 1)
                        + " - " + util.preencheComEspaco(endereco, " ", 50, 1));
            }
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }

    public void atendimento() {
        try {
            PreparedStatement pesquisa = acesso.getConexao().prepareStatement("SELECT * FROM tb_atendimento"
                    + " INNER JOIN tb_empresa ON tb_atendimento.id_empresa=tb_empresa.id_empresa"
                    + " INNER JOIN tb_analista ON tb_atendimento.id_analista=tb_analista.id_analista;");
            ResultSet resultado = pesquisa.executeQuery();
            System.out.println("----------------------------------------");
            System.out.println("LISTA DE ATENDIMENTO");
            System.out.println("----------------------------------------");
            System.out.println("N. ATENDIMENTO - RAZÃO SOCIAL    - ANALISTA          - DESCRIÇÃO");
            while (resultado.next()) {
                int num_atend = Integer.parseInt(resultado.getString("num_atendimento"));
                String razao_social = resultado.getString("razao_social");
                String nome_analista = resultado.getString("nome_analista");               
                String desc = resultado.getString("descricao");
                System.out.println("       " + num_atend + "       - "
                        + util.preencheComEspaco(razao_social, " ", 15, 1)
                        + " - " + util.preencheComEspaco(nome_analista, " ", 17, 1) + " - " + util.preencheComEspaco(desc, " ", 25, 1));
            }
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("Erro ao executar o comando: " + e);
        }
    }
}
