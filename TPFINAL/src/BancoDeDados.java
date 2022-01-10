// GABRIEL FAUSTINO -- 3005399

import java.sql.Connection; 
import java.sql.SQLException; 

public class BancoDeDados {     
    public static void main(String[] args) throws SQLException {
         new Conexao();
         Connection connection = Conexao.fazConexao();
         
         System.out.println("Funcionou!");
         
         connection.close();
     }
}
