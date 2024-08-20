package br.com.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Devan
 */
public class ConexaoBD {
   
    private Connection con;
    String server = "jdbc:mysql://localhost:3306/programateca?useSSL=false";
        String user = "root";
        String senha = "1384";
        String driver = "com.mysql.cj.jdbc.Driver";
        
        public Connection conectar(){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(server, user, senha);
            
            return con;
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
            return null;
        }
        }
    
  public Connection getConnection() throws SQLException{
      Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/programateca", "root","1384");
      return conexao;
  }  
    
}
