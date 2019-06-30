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
import javafx.stage.Stage;

public class AddEmployeeController {

    @FXML TextField txtName;
    @FXML TextField txtSalary;
    @FXML TextField txtJobTitle;
    @FXML ComboBox<Department> cbDept;

    @FXML Button btnAdd;
    @FXML Button btnClose;


    public void add(){
        System.out.println(txtName.getText() + "\n" + txtSalary.getText());
    }


    public void close(){
        Stage stage = (Stage)btnClose.getScene().getWindow();
        stage.close();
    }
}
