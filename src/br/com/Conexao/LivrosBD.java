package br.com.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aluno
 */
public class LivrosBD {
    private Connection cn = null;
    private Statement st = null;
    private ResultSet rs = null;

    public void conectar() {
        String server = "jdbc:mysql://127.0.0.1:3306/programateca";
        String user = "root";
        String senha = "Aluno";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            this.cn = DriverManager.getConnection(server, user, senha);
            this.st = this.cn.createStatement();
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
    }

    public boolean conectado() {
        if (this.cn != null) {
            return true;
        } else {
            return false;
        }
    }

    public void apagarLivro(String id) {
        try {
            String query = "delete from livros where id =" + id + ";";
            this.st.executeUpdate(query);
            System.out.println("Contato apagado\n---------------------------------------");
        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public void editarLivro(String id, String nome, String telefone, String sexo, String cpf, String rg, String dataNasc, String ender, String numero, String bairro, String cep, String cidade, String estado, String pais, String email, String nomePai, String nomeMae) {
        try {
            String query = "update livros set nome = '" + nome + "',telefone = " + "'" + telefone + "', cpf = '" + cpf + "', rg = '" + rg + "', data_nasc = '" + dataNasc + "', endereco = '" + ender + "', numero = '" + numero + "', bairro = '" + bairro + "', cep = '" + cep + "', cidade = '" + cidade + "', estado = '" + estado + "', pais = '" + pais + "', email = '" + email + "', nome_pai = '" + nomePai + "', nome_mae = '" + nomeMae + "' where id = " + id + " ";
            this.st.executeUpdate(query);
            System.out.println("Contato atualizado\n---------------------------------------");
        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public void addLivro(String nome, String telefone, String sexo, String cpf, String rg, String dataNasc, String ender, String numero, String bairro, String cep, String cidade, String estado, String pais, String email, String nomePai, String nomeMae) {
        try {
            String query = "insert into livros(nome, sexo, telefone, cpf, rg, data_nasc, endereco, numero, bairro, cep, cidade, estado, pais, email, nome_pai, nome_mae) values " + "('" + nome + "','" + sexo + "','" + telefone + "','" + cpf + "','" + rg + "','" + dataNasc + "','" + ender + "','" + numero + "','" + bairro + "','" + cep + "','" + cidade + "','" + estado + "','" + pais + "','" + email + "','" + nomePai + "','" + nomeMae + "')";
            System.out.println("Contato adicionado!\n---------------------------------------");
            this.st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }

    }

    public void listarLivros() {

        try {
            String query = "select * from livros order by nome";
            this.rs = this.st.executeQuery(query);
            while (this.rs.next()) {
                System.out.println("ID: " + this.rs.getString("id") + "\nNome: " + this.rs.getString("nome") + "\nSexo: " + this.rs.getString("sexo") + "\nTelefone: " + this.rs.getString("telefone") + "\nCPF: " + this.rs.getString("cpf") + "\nRG: " + this.rs.getString("rg") + "\nData de Nascimento: " + this.rs.getString("data_nasc") + "\nEndereço: " + this.rs.getString("endereco") + "\nNumero da casa: " + this.rs.getString("numero") + "\nBairro: " + this.rs.getString("bairro") + "\nCEP: " + this.rs.getString("cep") + "\nCidade: " + this.rs.getString("cidade") + "\nEstado: " + this.rs.getString("estado") + "\nPais: " + this.rs.getString("pais") + "\nEmail: " + this.rs.getString("email") + "\nNome do Pai: " + this.rs.getString("nome_pai") + "\nNome da Mãe: " + this.rs.getString("nome_mae") + "\n---------------------------------------");
            }
        } catch (SQLException ex) {
            System.out.println("Erro" + ex.getMessage());
        }
    }

    public void desconectar() {
        try {
            this.cn.close();
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
}
