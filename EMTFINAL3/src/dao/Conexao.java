package dao;
import java.sql.*;
public class Conexao {
        public Connection getConnection() throws SQLException{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtabela", "root", "1234" );
            return conexao;
        }
}
