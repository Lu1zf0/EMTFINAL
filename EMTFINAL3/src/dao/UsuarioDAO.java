package dao;
import java.sql.*;
import model.Usuario;

public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{
        String sql = "insert into funcionarios(nome,email,senha,cre) values('"+usuario.getNome()+"','"+usuario.getEmail()+"','"+usuario.getSenha()+"','"+usuario.getCre()+"');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();

    }

    public boolean existeNoBancoPorEmaileSenha(Usuario usuario) throws SQLException {
        String sql = "select * from funcionarios where email = '"+ usuario.getEmail()+"' and senha = '"+usuario.getSenha()+"';";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();
    }

}
