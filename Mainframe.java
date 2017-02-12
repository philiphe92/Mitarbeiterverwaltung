package GUI;

import Logical.Mitarbeiter;
import Logical.MitarbeiterListe;
import Logical.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;


/**
 * Created by philip on 06.02.17.
 */
public class Mainframe implements EventHandler {

    public List l1;

    public Mainframe(){

    }

    public void setList(List l){
        this.l1 = l;
    }

    public void mainWindow(Stage primarystage){
        Stage mainframe = primarystage;
        BorderPane main = new BorderPane();


        MenuBar m1 = new MenuBar();
            Menu data = new Menu("Daten");
                MenuItem employeList = new MenuItem("Mitarbeiter Liste");
                MenuItem newEmploye = new MenuItem("Neuer Mitarbeiter");
                MenuItem editEmploye = new MenuItem("Mitarbeiter bearbeiten");
                MenuItem deleteEmploye = new MenuItem("Mitarbeiter Löschen");
            data.getItems().addAll(employeList,newEmploye,editEmploye,deleteEmploye);

            Menu calc = new Menu("Berechnungen");
                    MenuItem monthly = new MenuItem("Mitarbeiter Liste");
                    MenuItem yearly = new MenuItem("Mitarbeiter Liste");
            calc.getItems().addAll(monthly,yearly);

            Menu analyse = new Menu("Analysen");
                   MenuItem yearlycomp = new MenuItem("Jahrevergleich");
                analyse.getItems().addAll(yearlycomp);

            Menu print = new Menu("Drucken");

            m1.getMenus().addAll(data,calc,analyse);
            main.setTop(m1);

        VBox overwatch = new VBox();

        main.setLeft(overwatch);




            ComboBox dropdown = new ComboBox();

        List liste = FXCollections.observableArrayList(l1);

        dropdown.setItems((ObservableList) liste);
        dropdown.getSelectionModel().selectFirst();


        overwatch.getChildren().addAll(dropdown);


        HBox btnmenu = new HBox();
        btnmenu.setAlignment(Pos.CENTER);
        btnmenu.setSpacing(20);

        main.setBottom(btnmenu);
                      Button printBtn = new Button("Drucken");
                      Button close = new Button("Schließen");
        btnmenu.getChildren().addAll(printBtn,close);

        Scene mainScene = new Scene(main,900,500);

        mainframe.setScene(mainScene);
        mainframe.show();










    }


    @Override
    public void handle(Event event) {

    }
}
