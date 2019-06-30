package Aula03.Controllers;


import Aula03.Department;
import Aula03.Employee;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddEmployeeController {

    @FXML TextField txtName;
    @FXML TextField txtSalary;
    @FXML TextField txtJobTitle;
    @FXML ComboBox<Department> cbDept;

    @FXML Button btnAdd;
    @FXML Button btnClose;

    /*private ObservableList<Employee> loadValues(){
        ObservableList<Employee> employee = FXCollections.observableArrayList();
        return employee;
    }

    public void fill(){
        cId.setCellValueFactory(new PropertyValueFactory<>("id"));
        cName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        cJobTitle.setCellValueFactory(new PropertyValueFactory<>("jobTitle"));
        cDeptInCharge.setCellValueFactory(new PropertyValueFactory<>("deptInCharge"));
        table.setItems(loadValues());
    }*/

}
