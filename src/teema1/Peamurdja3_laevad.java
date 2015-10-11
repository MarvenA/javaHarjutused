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
        int[][] openWater = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                openWater[i][j] = ship();
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(openWater[i]));
        }

        System.out.println(Arrays.toString(openWater));
        Scanner user = new Scanner(System.in);

        /*while (gameover(openWater)) {
            System.out.println("Sisesta üks number: ");
            int userInput = user.nextInt();
            int hit = openWater[userInput];
            if (hit == 0) {
                System.out.print("Möödas...");
            } else if (hit == 1) {
                System.out.println("Pihtas!");
                openWater[userInput] = 8;
                System.out.println(Arrays.toString(openWater));
            } else if (hit == 8) {
                System.out.println("Oled siia juba proovinud!");
            }
        }
        System.out.println("GAME OVER!! Kõik laevad põhjas!");
    }*/

    /*public static boolean gameover(int[] openWater) {
        for (int i = 0; i < openWater.length; i++) {
            if (openWater[i] == 1) {
                return true;
            }
        }
        return false;
    }*/

    private static int ship(){
        return (int) (Math.random()*2);
    }
}

