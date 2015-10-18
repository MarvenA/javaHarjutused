package teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.print("Sisesta täisarv, mida soovid kuupi tõsta: ");
        int arv = user.nextInt();
        System.out.println("Küsitud arvu kuup on: " + tostaKuupi(arv));


    }

    public static int tostaKuupi(int arv) {
        return (int) Math.pow(arv, 3);
    }

    public static int kasutajaSisestus(int number, int min, int max) {return 0;    }

}

