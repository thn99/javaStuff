package Aula03.DAO;

import Aula03.Employee;
import Aula03.Utils.ConnectionFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {


    public void save(Employee e){
        String sql = "INSERT INTO employee (id, name, jobTitle, salary) VALUES (?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();

        try(PreparedStatement statement = factory.createPreparedStatement(sql)){

            statement.setLong(1, e.getId());
            statement.setString(2, e.getName());
            statement.setString(3, e.getJobTitle());
            statement.setDouble(4, e.getSalary());

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

    public List<Employee> readAll(){
        List<Employee> list = FXCollections.observableArrayList();
        String sql = "SELECT * FROM employee";
        ConnectionFactory factory = new ConnectionFactory();
        try(PreparedStatement statement = factory.createPreparedStatement(sql)){
            ResultSet rs = statement.executeQuery();
            Employee employee = null;
            while(rs.next()){
                employee = new Employee(rs.getString("name"), rs.getString("jobTitle"), rs.getLong("id"),
                        rs.getDouble("salary"), null);
                list.add(employee);
            }
            return list;
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
