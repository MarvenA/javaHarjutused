package teema1;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
        int diceSumComp=0;
        int diceSumUser = 0;
        for (int i = 0; i < 2; i++) {
            int dice = (int) (1+ Math.random() * 6);
            diceSumComp = diceSumComp + dice;
        }
        for (int i = 0; i < 2; i++) {
            int dice = (int) (1+ Math.random() * 6);
            diceSumUser = diceSumUser + dice;
        }
        System.out.println("Arvuti silmade arv on " + diceSumComp + ", mängijal on " + diceSumUser + ".");
        if (diceSumComp>diceSumUser) {
            System.out.println("Arvuti võitis!!");
        }else if (diceSumComp==diceSumUser) {
            System.out.println("Viik!");
        }else {
            System.out.println("Mängija võitis!!");
        }
    }
}
