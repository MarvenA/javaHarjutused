package teema1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by maus on 30.10.2015.
 */
public class LaevadPommitamine {
    static int laud [][];

    public static void main(String[] args) {

        // /Mängulaud genereerida
        generateTable();

        //Täida laud laevadega
        //fillTableWithShips();

        //Kasutajalt küsida kuhu pommitada
        //askWhereToBomb();

        //Pommitamise tulemus
        //resultOFBombing();

        // Kontrollida kas laevu on
        //anyShipsLeft();

        // Kui laevad otsas, siis mäng läbi või uuesti step3
    }

    private static void generateTable() {
        HashMap<> a = new HashMap();
        a.put("Toomas", 4);
        a.put("Mart", 2);
        a.put("Kai", 3);
    }
    //Kui muutuja algab väikese tähega (nt. int), siis ta ei ole objekt - kui suure tähega (nt. String), siis ta on objekt ja tal on meetodid.
    /*Static - staatiline meetod ei suhtle teistega, ei saa kasutada välist infot!
    Sellepärast võtsime generateTable() eest static ära, et kasutame laud[][] muutujat kasutada*/
    // On klassi meetodid ja isendi meetodid
    // Massiivi kasutatakse siis, kui on teada, mitu kohta selles on. Pikkust ei saa muuta.
    // Arraylisti kasutakse siis, kui ei ole teada, mitut kohta on vaja ehk pikkust saab muuta.
    //"null" ei ole int, "null" saab olla see, mis on objekt.

    public static void resultOfBombing(){
        //Kui kasutaja sai pihta
        pihtas();
        // Kui ei saanud pihta
        möödas();
    }


}
