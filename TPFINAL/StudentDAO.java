//Gabriel Faustino - 3005399


import java.sql.*;

public class StudentDAO { 
    private Connection connection;
    String nome;
    Integer idade;
    Double peso;
    Double altura;
    String objetivo;

    public StudentDAO() throws SQLException{ 
        new JavaConnect();
		this.connection = JavaConnect.fazConexao();
    } 
    public void insert(Student s){ 
        String sqlInsert = "INSERT INTO tb_cliente(nome,idade,peso,altura,objetivo) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sqlInsert);
            stmt.setString(1, s.getName());
            stmt.setInt(2, s.getAge());
            stmt.setDouble(3, s.getWeight());
            stmt.setDouble(4, s.getHeight());
            stmt.setString(5, s.getGoal());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}