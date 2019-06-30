package Aula03.Controllers;

import Aula03.Department;
import Aula03.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewEmployeeController {
    @FXML TableView<Employee> table;
    @FXML TableColumn<Employee, Long> cId;
    @FXML TableColumn<Employee, String> cName;
    @FXML TableColumn<Employee, Double> cSalary;
    @FXML TableColumn<Employee, String> cJobTitle;
    @FXML TableColumn<Department, String> cDeptInCharge;

    @FXML Button btnAdd;
    @FXML Button btnRemove;
    @FXML Button btnEdit;
    @FXML Button btnDept;




}
