package br.com.Controlador;

import br.com.Conexao.ConexaoBD;
import br.com.Conexao.LoginBD;
import br.com.DAO.LoginDAO;
import br.com.Interface.CadastroView;
import br.com.Interface.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class ControladorLogin {
    public void loginUsuario(LoginView lv) throws SQLException{   
     LoginBD login = new LoginBD();
     login.conectar();
     login.verificaUser(lv.getJtEmail().getText(),lv.getJpSenha().getText());
             
   }
    
    public void cadastroUsuario(CadastroView view) throws SQLException{
   
     LoginDAO cadastro = new LoginDAO();
     cadastro.cadastrarUsuario(view.getJtNome().getText(), view.getJtEmail().getText(), view.getJpSenha().getText());
     
   }
}
