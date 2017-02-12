package Logical;

import javafx.application.Application;
import javafx.stage.Stage;
import GUI.Mainframe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by philip on 06.02.17.
 */
public class Main extends Application{


public static void main(String[]args){







    launch(args);
}









    public void start(Stage primaryStage) throws Exception {

    Mitarbeiter emp1 = new Mitarbeiter("Philip","Herzog","deutsch",29021992);
        MitarbeiterListe m1 = new MitarbeiterListe(new ArrayList<Mitarbeiter>());


    Mainframe mf1= new Mainframe();
    mf1.setList((List) m1);



    mf1.mainWindow(primaryStage);
    }
}
