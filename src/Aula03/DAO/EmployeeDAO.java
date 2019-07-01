package Aula03.DAO;

import Aula03.Employee;
import Aula03.Utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {


    public void save(Employee e){
        String sql = "INSERT INTO employee (name, jobTitle, salary) VALUES (?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
        try(PreparedStatement statement = factory.createPreparedStatement(sql)){
            statement.setString(1, e.getName());
            statement.setString(2, e.getJobTitle());
            statement.setDouble(3, e.getSalary());
            statement.execute();
        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    public void delete(Employee e){
        String sql = "DELETE FROM employee WHERE ID = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try(PreparedStatement statement = factory.createPreparedStatement(sql)){
            statement.setLong(1, e.getId());
            statement.execute();
        } catch(SQLException exception){
            exception.printStackTrace();
        }
    }

    public void update(Employee e){
        String sql = "UPDATE employee SET name = ?, jobTitle = ?, salary = ? WHERE id = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try(PreparedStatement statement = factory.createPreparedStatement(sql)){
            statement.setString(1, e.getName());
            statement.setString(2, e.getJobTitle());
            statement.setDouble(3, e.getSalary());
            statement.setLong(4, e.getId());
            statement.execute();

        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}
