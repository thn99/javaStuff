package Aula03.Controllers;

import Aula03.Department;
import Aula03.Employee;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewEmployeeController {
    public ObservableList<Employee> list;
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
    @FXML Button btnClose;

    public void show(){
        Pane sceneGraph = null;
        try{
            FXMLLoader loader = new FXMLLoader();
            sceneGraph = loader.load(getClass().getResource("/Aula03/View/AddEmployee.fxml"));
            Scene scene = new Scene(sceneGraph, 400, 400);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void fill(){

    }

    public void close(){
        Stage stage = (Stage)btnClose.getScene().getWindow();
        stage.close();
    }

}
