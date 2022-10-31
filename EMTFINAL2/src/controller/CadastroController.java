package controller;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Cadastro;

public class CadastroController {
    private Cadastro view;

    public CadastroController(Cadastro view) {
        this.view = view;
    }
    
    public void salvarUsuario(){
        
        String  nome = view.getTxtNome().getText();
        String email = view.getTxtEmail().getText();
        String senha = view.getTxtSenha().getText();
        String senhaconfirmar = view.getTxtSenhaCadastrocc().getText();
        String cre = view.getTxtCRE().getText();
        
        if(senha.equals(senhaconfirmar)){
            
            Usuario usuarionovo = new Usuario(nome,email,senha,cre);

            try {
                Connection conexao = new Conexao().getConnection();
                UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
                usuarioDao.insert(usuarionovo);

                JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
            } catch (SQLException ex) {
                Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        } else{
                JOptionPane.showMessageDialog(null,"As senhas não conferem!");
        }
        

    }
}
