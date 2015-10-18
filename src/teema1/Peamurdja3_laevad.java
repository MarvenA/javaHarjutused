package teema1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */


public class Peamurdja3_laevad {
    public static void main(String[] args) {
        int[][] openWater = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                openWater[i][j] = ship();
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(openWater[i]));
        }

        Scanner userInput1 = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);

        while(gameover(openWater)){
            System.out.println("Vali rea number 1 ja " + openWater.length + " vahel.");
            int rida = (userInput1.nextInt()-1); //-1 sellepärast, et loendamine algab nullist mitte ühest.
            System.out.println("Vali veeru number 1 ja " + openWater.length + " vahel.");
            int veerg = (userInput2.nextInt()-1); //-1 sellepärast, et loendamine algab nullist mitte ühest.

            if (openWater[rida][veerg] == 1){
                System.out.println("Pihtas-põhjas!");
            } else {
                System.out.println("Möödas. Proovi uuesti");
            }
            if (openWater[rida][veerg] == 8) {  //Kontrollib kas on juba seda kohta tulistanud
                System.out.println("Juba tulistasid siia! Proovi uuesti");
            }
            if (openWater[rida][veerg] == 1){
                openWater[rida][veerg] = 8;     //Pihta saanud laev märgitakse teistsuguseks
            }
        }
        System.out.println("Kõik laevad põhjas!");
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(openWater[i]));
        }
    }

    public static int ship() {
        return (int) (Math.random() * 2); //Genereerib 0 või 1
    }

    public static boolean gameover(int [][] openWater){ //Kontrollib, kas laual on veel ühtesid.
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if (openWater[i][j] == 1){
                    return true;
                }
            }
        }
        return false;
    }
}


