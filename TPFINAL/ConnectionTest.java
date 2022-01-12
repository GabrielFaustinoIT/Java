
 //Gabriel Faustino - 3005399

import java.sql.Connection; 
import java.sql.SQLException; 

public class ConnectionTest {     
    public static void main(String[] args) throws SQLException {
         Connection connection = new JavaConnect().fazConexao();
         System.out.println("Connection working!");
         connection.close();
     }
}