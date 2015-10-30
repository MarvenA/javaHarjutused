package teema1;

import java.util.*;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 *    ja sorteeri tulemus suuruse järgi. (ArrayList)
 *
 * main() meetodi saad lühendiga psvm.
 */
public class Harjutus4_massiivid {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList();
        Scanner user = new Scanner(System.in);
        System.out.println("Siseta numbreid.");

        int number = user.nextInt();
        while (number>0){
                List.add(number);
                number = user.nextInt();
        }
        Collections.sort(List);
        System.out.println(List);
    }
}
