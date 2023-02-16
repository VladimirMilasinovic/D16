package DomaciOOP;

import java.util.Scanner;

public class DomaciOOP1 {
        public static void main(String[] args) {
//        Zadatak 1.
//        Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz imena i String koji
//         zelimo da proverimo,
//                ispisati poruku ukoliko se ime nalazi u nizu, obavestiti ako nije tu. (Ime za proveru vi unosite)

            Scanner sc = new Scanner(System.in);
            System.out.println("Unesite ime");
            String ime = sc.next();
            String [] niz = {"Pera", "Zika", "Laza"};
            boolean uNizuJeIme = proveraImena(ime,niz);

            if(uNizuJeIme){
                System.out.println("Ime je u nizu");
            }
            else {
                System.out.println("Ime nije u nizu");
            }
        }

        public static boolean proveraImena(String ime, String [] niz ) {


            for (int i = 0; i < niz.length; i++) {
                if (ime.equals(niz[i])) {
                    return true;
                }
            }
            return false;
    }
}
