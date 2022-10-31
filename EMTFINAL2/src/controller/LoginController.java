package controller;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.DadosFuncionario;
import view.Login;

public class LoginController {
    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        String email = view.getTxtEmail().getText();
        String senha = view.getTxtSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(email,senha);
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.existeNoBancoPorEmaileSenha(usuarioAutenticar);
        
        if(existe){
            new DadosFuncionario().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Email ou senha inválidos!");
        }
    }
    
    
}
