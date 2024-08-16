package br.com;

import br.com.Conexao.LoginBD;
import br.com.Interface.LoginView;

/**
 *
 * @author aluno
 */
public class ProgramaTeca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginView lv = new LoginView();
        lv.setVisible(true);
        LoginBD lbd = new LoginBD();
        lbd.conectar();
        lbd.conectado();
        
        if (lbd.conectado()==true){
            System.out.println("Conectado");
        }else{System.out.println("Não conectado");}
    }
    
}
