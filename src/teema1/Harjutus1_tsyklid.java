package teema1;

import java.util.Arrays;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {
    public static void main(String[] args) {
        int [][] tabel = new int[10][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 ; j++) {
                    tabel[i][j] = i+j;
                if( i+j>9 ){
                    tabel[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(tabel[i]));
        }
    }
}
