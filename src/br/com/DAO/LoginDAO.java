package br.com.DAO;

import br.com.Conexao.ConexaoBD;
import br.com.Conexao.LoginBD;
import br.com.Interface.HomeView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class LoginDAO {
    public void Login(String email, String senha) throws SQLException {
        
        Connection conexao = new ConexaoBD().getConnection();
        String sql = "select email,senha from login where email = '" + email + "' and senha = '" + senha + "'";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();

        if (rs.next()) {
            HomeView hv = new HomeView();
            hv.setVisible(true);
            System.out.println("Possui");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos!");
            
        }
        conexao.close();

    }
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException {
        Connection conexao = new ConexaoBD().getConnection();
        String sql1 = "select email from login where email = '" + email + "'";
        System.out.println(sql1);
        PreparedStatement statment1 = conexao.prepareStatement(sql1);
        ResultSet rs1 = statment1.executeQuery();
        if (rs1.next()) {
            JOptionPane.showMessageDialog(null, "Usuario ou senha já exite!");
            
        } else {
            String sql = "INSERT INTO login (nome, email, senha) VALUES ('" + nome + "', '" + email + "', '" + senha + "')";
            System.out.println(sql);
            PreparedStatement statment = conexao.prepareStatement(sql);
            statment.execute();
            conexao.close();
        }
    }
}
