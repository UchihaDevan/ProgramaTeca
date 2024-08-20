package br.com.Conexao;

import br.com.Interface.HomeView;
import br.com.Interface.LoginView;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class LoginBD {

    private Connection cn = null;
    private Statement st = null;
    private ResultSet rs = null;

    public void conectar() {
        String server = "jdbc:mysql://localhost:3306/programateca?useSSL=false";
        String user = "root";
        String senha = "1384";
        String driver = "com.mysql.cj.jdbc.Driver";   //postgresql://postgres:IciEssLiAGVhWihpremgjjdVuLodFgEF@autorack.proxy.rlwy.net:33438/railway

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

    public void apagarContato(String id) {
        try {
            String query = "delete from contato where id =" + id + ";";
            this.st.executeUpdate(query);
            System.out.println("Contato apagado\n---------------------------------------");
        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public void editarContato(String id, String nome, String telefone, String sexo, String cpf, String rg, String dataNasc, String ender, String numero, String bairro, String cep, String cidade, String estado, String pais, String email, String nomePai, String nomeMae) {
        try {
            String query = "update contato3 set nome = '" + nome + "',telefone = " + "'" + telefone + "', cpf = '" + cpf + "', rg = '" + rg + "', data_nasc = '" + dataNasc + "', endereco = '" + ender + "', numero = '" + numero + "', bairro = '" + bairro + "', cep = '" + cep + "', cidade = '" + cidade + "', estado = '" + estado + "', pais = '" + pais + "', email = '" + email + "', nome_pai = '" + nomePai + "', nome_mae = '" + nomeMae + "' where id = " + id + " ";
            this.st.executeUpdate(query);
            System.out.println("Contato atualizado\n---------------------------------------");
        } catch (SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    public void addContato(String nome, String telefone, String sexo, String cpf, String rg, String dataNasc, String ender, String numero, String bairro, String cep, String cidade, String estado, String pais, String email, String nomePai, String nomeMae) {
        try {
            String query = "insert into cadastros(nome, sexo, telefone, cpf, rg, data_nasc, endereco, numero, bairro, cep, cidade, estado, pais, email, nome_pai, nome_mae) values " + "('" + nome + "','" + sexo + "','" + telefone + "','" + cpf + "','" + rg + "','" + dataNasc + "','" + ender + "','" + numero + "','" + bairro + "','" + cep + "','" + cidade + "','" + estado + "','" + pais + "','" + email + "','" + nomePai + "','" + nomeMae + "')";
            System.out.println("Contato adicionado!\n---------------------------------------");
            this.st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }

    }

    public void verificaUser(String email, String senha) throws SQLException {
        
        String query = "select email,senha from login where email = '" + email + "' and senha = '" + senha + "'";
        this.rs = this.st.executeQuery(query);
        if (rs.next()) {
            HomeView hv = new HomeView();
            hv.setVisible(true);
            
            System.out.println("Possui");
            
        }else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos!");
            
        }
        cn.close();
    }

    public void desconectar() {
        try {
            this.cn.close();
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
}
