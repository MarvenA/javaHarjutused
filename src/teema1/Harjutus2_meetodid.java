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

        int min = 10;
        int max = 20;
        int x   = kasutajaSisestus(min, max);
        System.out.println("Pakutud vahemik oli " + min + " kuni " + max + ".");
        System.out.println(x + " mahub vahemikku :)");
    }

    public static void tostaKuupi(int x) {
        System.out.println("Küsitud arvu kuup on " + Math.pow(x, 3));
    }

    public static int kasutajaSisestus(int a, int b) {
        Scanner user1 = new Scanner(System.in);
        System.out.println("Sisesta üks number: ");
        int number = user1.nextInt();
        while (number < a || number > b) {
            System.out.println("Sisesta uus number, eelmine ei mahtunud vahemikku: ");
            number = user1.nextInt();
        }
        return number;
    }
}

