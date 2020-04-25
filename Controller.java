package sample;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.mysql.cj.xdevapi.AddStatement;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.UUID;

public class Controller implements Initializable {

    @FXML
    JFXListView firstTableView;
    @FXML
    JFXButton createstudentbutton;
    @FXML
    JFXButton loadstudentbutton;
    @FXML
    JFXButton filterbyage;
    @FXML
    JFXButton filterbygpa;
    @FXML
    JFXButton filterbyname;

    final String hostname = "student-database.cfpfuguu0lfp.us-east-1.rds.amazonaws.com";
    final String dbName = "studentdb";
    final String port = "3306";
    final String username = "muhaider";
    final String password = "Usman23!";
    final String AWS_URL = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + username + "&password="
            + password;
    private Object MultiSelectListView;
    //final String DB_URL = "jdbc:derby:EmployeeDB;create=true";

    private void createDatabase(String url) {

        try{

            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();

            try {
                stmt.execute("CREATE TABLE Student (" +
                        "FirstName CHAR(25), " +
                        "Age CHAR(25), " +
                        "Id VARCHAR(36), " +
                        "Major CHAR(25)," +
                        "Gpa CHAR(25) )");

                System.out.println("TABLE CREATED");
            }

            catch (Exception ex) {
                System.out.println("TABLE ALREADY EXISTS, NOT CREATED");
            }

            UUID id = UUID.randomUUID();
            id = UUID.randomUUID();
            String idString = id.toString();
            String firstName1 = url.equals(AWS_URL) ? "Ana": "";
            int age1 = url.equals(AWS_URL) ? 22 : 67;
            String major1 = url.equals(AWS_URL) ? "Biology." : "";
            double gpa1 = url.equals(AWS_URL) ? 3.9 : 2.5;

            String sql = "INSERT INTO Student VALUES" +
                    "('" + firstName1 + "', '" + age1 + "', '" + idString+"', '" + gpa1+"', '" + major1 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName2 = url.equals(AWS_URL) ? "Clark": "";
            int age2 = url.equals(AWS_URL) ? 45 : 67;
            String major2 = url.equals(AWS_URL) ? "Chemical Engineering." : "";
            double gpa2 = url.equals(AWS_URL) ? 3.9 : 2.5;

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName2 + "', '" + age2 + "', '" + idString+"', '" + gpa2+"', '" + major2 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName3 = url.equals(AWS_URL) ? "John": "";
            int age3 = url.equals(AWS_URL) ? 22 : 67;
            String major3 = url.equals(AWS_URL) ? "Computer Science." : "";
            double gpa3 = url.equals(AWS_URL) ? 3.5: 2.5;

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName3 + "', '" + age3 + "', '" + idString+"', '" + gpa3+"', '" + major3 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName4 = url.equals(AWS_URL) ? "Justin": "";
            int age4 = url.equals(AWS_URL) ? 26 : 67;
            String major4 = url.equals(AWS_URL) ? "Mathematics." : "";
            String gpa4 = url.equals(AWS_URL) ? "3.8" : "";

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName4 + "', '" + age4 + "', '" + idString+"', '" + gpa4+"', '" + major4 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName5 = url.equals(AWS_URL) ? "Michael": "";
            int age5 = url.equals(AWS_URL) ? 23 : 67;
            String major5 = url.equals(AWS_URL) ? "Arts." : "";
            String gpa5 = url.equals(AWS_URL) ? "3.3" : "";

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName5 + "', '" + age5 + "', '" + idString+"', '" + gpa5+"', '" + major5 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName6 = url.equals(AWS_URL) ? "Ron": "";
            int age6 = url.equals(AWS_URL) ? 21 : 67;
            String major6 = url.equals(AWS_URL) ? "Business Administration." : "";
            String gpa6 = url.equals(AWS_URL) ? "3.6" : "";

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName6 + "', '" + age6 + "', '" + idString+"', '" + gpa6+"', '" + major6 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName7 = url.equals(AWS_URL) ? "Jose": "";
            int age7 = url.equals(AWS_URL) ? 27 : 67;
            String major7 = url.equals(AWS_URL) ? "Finance." : "";
            String gpa7 = url.equals(AWS_URL) ? "3.0" : "";

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName7 + "', '" + age7 + "', '" + idString+"', '" + gpa7+"', '" + major7 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName8 = url.equals(AWS_URL) ? "Rollins": "";
            int age8 = url.equals(AWS_URL) ? 25 : 67;
            String major8 = url.equals(AWS_URL) ? "Supply Chain Management." : "";
            String gpa8 = url.equals(AWS_URL) ? "3.1" : "";

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName8 + "', '" + age8 + "', '" + idString+"', '" + gpa8+"', '" + major8 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName9 = url.equals(AWS_URL) ? "Murphy": "";
            int age9 = url.equals(AWS_URL) ? 28 : 67;
            String major9 = url.equals(AWS_URL) ? "Biotechnology." : "";
            String gpa9 = url.equals(AWS_URL) ? "3.2" : "";

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName9 + "', '" + age9 + "', '" + idString+"', '" + gpa9+"', '" + major9 + "')";
            stmt.executeUpdate(sql);

            id = UUID.randomUUID();
            idString = id.toString();
            String firstName10 = url.equals(AWS_URL) ? "mani": "";
            int age10 = url.equals(AWS_URL) ? 27 : 67;
            String major10 = url.equals(AWS_URL) ? "Nursing." : "";
            String gpa10 = url.equals(AWS_URL) ? "3.8" : "";

            sql = "INSERT INTO Student VALUES" +
                    "('" + firstName10 + "', '" + age10 + "', '" + idString+"', '" + gpa10+"', '" + major10 + "')";
            stmt.executeUpdate(sql);

            System.out.println("TABLE FILLED");

            stmt.close();
            conn.close();
        }

        catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println(msg);
        }
    }

    private void loadData(String url) {
        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT FirstName, Age, Id, Major, Gpa FROM Student";
            ResultSet result = stmt.executeQuery(sqlStatement);
            ObservableList<Students> dbStudentList = FXCollections.observableArrayList();

            while (result.next()) {
                Students student = new Students();
                student.id = UUID.fromString(result.getString("Id"));
                student.firstName = result.getString("FirstName");
                student.age = result.getInt("Age");
                student.major = result.getString("Major");
                student.gpa = result.getString("Gpa");
                dbStudentList.add(student);
            }

                firstTableView.setItems(dbStudentList);

            System.out.println("Table Populated");
            stmt.close();
            conn.close();
        }

        catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println("Table NOT Populated");
            System.out.println(msg);
        }
    }

    private void sortbyage(String url) {
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT FirstName, Age, Id, Major, Gpa FROM Student WHERE Age > 25";
            ResultSet result = stmt.executeQuery(sqlStatement);
            ObservableList<Students> dbStudentList = FXCollections.observableArrayList();

            while (result.next()) {
                Students student = new Students();
                student.id = UUID.fromString(result.getString("Id"));
                student.firstName = result.getString("FirstName");
                student.age = result.getInt("Age");
                student.major = result.getString("Major");
                student.gpa = result.getString("Gpa");
                dbStudentList.add(student);
                firstTableView.setItems(dbStudentList);
            }
        }

        catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println(msg);
        }
    }

    private void sortbyname(String url) {
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT FirstName, Age, Id, Major, Gpa FROM Student WHERE FirstName LIKE 'm%'";
            ResultSet result = stmt.executeQuery(sqlStatement);
            ObservableList<Students> dbStudentList = FXCollections.observableArrayList();

            while (result.next()) {
                Students student = new Students();
                student.id = UUID.fromString(result.getString("Id"));
                student.firstName = result.getString("FirstName");
                student.age = result.getInt("Age");
                student.major = result.getString("Major");
                student.gpa = result.getString("Gpa");
                dbStudentList.add(student);
                firstTableView.setItems(dbStudentList);
            }
        }

        catch (Exception ex) {

            String msg = ex.getMessage();
            System.out.println(msg);
        }
    }

    private void sortbygpa(String url) {
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            String sqlStatement = "SELECT FirstName, Age, Id, Major, Gpa FROM Student ORDER BY Age DESC";
            ResultSet result = stmt.executeQuery(sqlStatement);
            ObservableList<Students> dbStudentList = FXCollections.observableArrayList();

            while (result.next()) {
                Students student = new Students();
                student.id = UUID.fromString(result.getString("Id"));
                student.firstName = result.getString("FirstName");
                student.age = result.getInt("Age");
                student.major = result.getString("Major");
                student.gpa = result.getString("Gpa");
                dbStudentList.add(student);
                firstTableView.setItems(dbStudentList);
            }
        }

        catch (Exception ex) {

            String msg = ex.getMessage();
            System.out.println(msg);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        createstudentbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createDatabase(AWS_URL);
            }
        });
        loadstudentbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                loadData(AWS_URL);
            }
        });
        filterbyage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sortbyage(AWS_URL);
            }
        });
        filterbyname.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sortbyname(AWS_URL);
            }
        });
        filterbygpa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sortbygpa(AWS_URL);
            }
        });
    }}