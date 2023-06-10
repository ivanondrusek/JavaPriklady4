package ulohy;

/*
Fizz buzz je skupinová slovná hra pre deti, ktorej účelom je naučiť ich delenie čísel. Hráči postupne vymenúvajú čísla,
pričom nahrádzajú každé číslo deliteľné tromi slovom "fizz" a každé číslo deliteľné piatimi slovom "buzz".

Hra
Hráči zvyčajne sedia v kruhu. Prvý hráč povie číslo "1" a každý ďalší hráč povie číslo o jedno vyššie od
predošlého. Akékoľvek číslo deliteľné tromi musí hráč nahradiť slovom fizz a akékoľvek číslo deliteľné piatimi
slovom buzz. Čísla deliteľné oboma sa nahrádzajú slovami fizz buzz. Hráč, ktorý zaváha alebo urobí chybu je vylúčený z hry.

Typická hra fizz buzz môže začínať takto:

1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23,
Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, …

Hint: % cize modulo je vypoctovy operator, ktory sa pouziva na vypocet zvysku po deleni
Hint2: || reprezentuje OR (ALEBO), to znamena, ze moze platit jedna podmienka alebo druha
Hint2, pokracovanie: && reprezentuje AND (A) to znamena, ze musi platit jedna podmienka a zaroven druha

Bonusová úloha: Program by mohol reagovať na voľne zadané čísla používateľom z konzoly, napr. v tvare 3 8 12 45 98
Na základe zadanej množiny vstupných hodnôt vypíše zodpovedajúce slová podľa zadania vyššie.

 */


import java.util.Scanner;

public class FizzBuzz {


public static void main(String[]args){


    Scanner sc = new Scanner(System.in);
    int vyber ;

    System.out.println("Pre generovanie stlac 1");
    System.out.println("Pre zadanie stač 2");
    vyber = sc.nextInt();


    if (vyber == 1){

        int[] zoznam = new int[30];
        naplnPole(zoznam);
        vypisFizzBuZZ(zoznam);

       /* Jednoduchšie bez ukladania do poľa


       for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 ==0 )  {
                System.out.print(" FizzBuzz ");
            } else if (i % 3 ==0) {
                System.out.print(" Fizz ");
            } else if (i % 5 ==0) {
                System.out.print(" Buzz ");
            }
            else {
                System.out.print(" "+i+" ");}
        }*/

    } else if (vyber == 2) {
        System.out.println("Zadaj počet čísel :");
        int[] zoznam = new int[sc.nextInt()];
        System.out.println("Zadaj svoje čísla :");
        naplnPoleVlastne(zoznam);
        vypisFizzBuZZ(zoznam
);
    }
    else  {System.out.println("Nesprávna voľba");}
}

    public static void vypisFizzBuZZ (int [] parPole){
        for (int i = 0; i < parPole.length; i++) {
            if (parPole[i] % 3 == 0 && parPole[i] % 5 ==0 )  {
                System.out.print(" FizzBuzz ");
            } else if (parPole[i] % 3 ==0) {
                System.out.print(" Fizz ");
            } else if (parPole[i] % 5 ==0) {
                System.out.print(" Buzz ");
            }
            else {
                System.out.print(" "+parPole[i]+" ");
            }
        }
        }

    public static void naplnPole( int [] parPole){
        for (int i = 0; i < parPole.length ; i++) {
            parPole[i]= i+1;
        }
    }


    public static void naplnPoleVlastne( int [] parPole){
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i < parPole.length ; i++) {
            parPole[i]= sc.nextInt();
        }
    }


}