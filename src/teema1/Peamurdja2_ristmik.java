package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;
import lib.Foor.ValgusV2rv;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {

    public void start (Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);

        tsykkel(foor1, 0);
        tsykkel(foor2, 0);
        tsykkel(foor3, 1);
        tsykkel(foor4, 1);
    }

    public void tsykkel (Foor foor, int suund) { // selle tsükliga käsutatakse nelja foori
        int count = suund;
        while (count <10) {
        if (count != 0){
            foor.vahetaPunast();
            foor.paus(4.4);
            foor.vahetaKollast();
            foor.paus(0.6);
            foor.vahetaKollast();
            foor.vahetaPunast();
        }
            foor.vahetaRohelist();
            foor.paus(3);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();

            count = count +1;
        }





    }
}
