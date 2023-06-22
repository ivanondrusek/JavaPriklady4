package ulohy;
/*

        Vytvorte dynamicke pole (prostredníctvom ArrayList), ktoré od používateľa bude žiadať zadanie číselných hodnôt - tie budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
        Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
        Poznámka: Skúsme “ošetriť” zadanie textových hodnôt tak, aby program nespadol.
        Bonusová úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScitanieVstupnychHodnotArrayList {
    public static void main(String[] args) {

        ArrayList<Double> zoznam = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double vstup = 0;

        System.out.println("Zadaj čísla");
        while (vstup>=0) {

           try{
               vstup=sc.nextDouble();
            if (vstup>=0)
            zoznam.add(vstup);
            else break; }
           catch(InputMismatchException e){
               System.out.println("Chyba vo vstupných hodnotách - Zadaj číslo!");
               break;
           }
//           finally {
//               vstup = sc.nextDouble();
//               if (vstup>=0)
//                   zoznam.add(vstup);
//               else break;
//           }
        }

        vypisZoznamDouble(zoznam);
        System.out.println("Súčet zoznamu je "+ spocitajZoznam(zoznam));

    }

    public static void vypisZoznamDouble(ArrayList <Double> parArray) {
        for (Double p : parArray)
        {
            System.out.println(p);
        }
    }
    public static double spocitajZoznam(ArrayList <Double> parArray) {

        double e = 0;

        for (Double p : parArray)
        {
            e=+(p);
        }
        return e;
    }
}
