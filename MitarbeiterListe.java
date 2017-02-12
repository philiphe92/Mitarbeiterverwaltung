package Logical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by philip on 06.02.17.
 */
public class MitarbeiterListe {
    private int count = 0;
    private List empList;

    public MitarbeiterListe(List l){
        this.empList = l;

    }



    public void addEmploye(Mitarbeiter m){

        empList.add(count,m);
        count++;
    }


}