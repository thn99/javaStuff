package Aula03.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory implements AutoCloseable{
    private Connection conn;
    private PreparedStatement statement;

    public Connection createConnection(){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:database.db");
        } catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    public PreparedStatement createPreparedStatement(String sql){
        try{
            statement = createConnection().prepareStatement(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return statement;
    }

    public void close() throws Exception{
        if(conn != null){
            conn.close();
            if(statement != null){
                statement.close();

            }
        }
    }

}
