package Aula03.Controllers;

import Aula03.Department;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewDepartmentController {
    @FXML TableView<Department> tableDepartment;
    @FXML TableColumn<Department, Integer> cCode;
    @FXML TableColumn<Department, String> cName;
    @FXML TableColumn<Department, String> cLocation;
    @FXML TableColumn<Department, Double> cBudget;
    @FXML TableColumn<Department, Integer> cPhoneExtension;

    private ObservableList<Department> loadValues(){
        ObservableList<Department> dept = FXCollections.observableArrayList();
        return dept;
    }

    public void fill(){
        cCode.setCellValueFactory(new PropertyValueFactory<>("code"));
        cName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        cBudget.setCellValueFactory(new PropertyValueFactory<>("budget"));
        cPhoneExtension.setCellValueFactory(new PropertyValueFactory<>("phoneExtension"));
        tableDepartment.setItems(loadValues());
    }
}
