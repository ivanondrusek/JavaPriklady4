package ulohy;

import java.util.Scanner;

public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {
        /*Uloha 1: Základné matematické operácie


        Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
        Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.

        {}
                Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
        Program nám zároveň vypíše takýto text:
        Výsledkom sčítania hodnôt 2 a 3 je 5.
        Výsledkom odčítania hodnôt 2 a 3 je -1.
        atď.
                Bonusová úloha: Vedeli by ste v prípade desatinných miest nahradiť desatinnú bodku za čiarku?
        Pomôcka:
        Ako naformatovat cislo v SK formate na 2 desatinne miesta, pouzijeme %.2f
        System.out.printf("Desatinné číslo naformátované ako desatinná čiarka %.2f", desatinneCislo);

        Bonusová úloha č.2: Vstup hodnôt by mohol byť cez konzolu, čiže Scanner.*/

        Scanner citac = new Scanner(System.in);

        double cislo1 = citac.nextDouble();
        double cislo2 = citac.nextDouble();
        String operacia = citac.next();
        /*double scitanie = cislo1+cislo2;
        double odcitanie = cislo1-cislo2;
        double nasobenie = cislo1*cislo2;
        double delenie = cislo1/cislo2;
        double modulo = cislo1%cislo2;*/

        switch (operacia){
            case "+":
                System.out.printf("Výsledkom sčítania hodnôt %.2f a %.2f je : %.2f ",cislo1,cislo2,scitanie(cislo1,cislo2));
                break;
            case "-":
                System.out.println("Výsledkom odčítania hodnôt "+cislo1+"a "+cislo2+" je : "+odcitanie(cislo1,cislo2));
                break;
            case "*":
                System.out.println("Výsledkom násobenia hodnôt "+cislo1+"a "+cislo2+" je : "+nasobenie(cislo1,cislo2));
                break;
            case "/":
                System.out.println("Výsledkom delenia hodnôt "+cislo1+"a "+cislo2+" je : "+delenie(cislo1,cislo2));
                break;
            case "%":
                System.out.println("Výsledkom modula hodnôt "+cislo1+"a "+cislo2+" je : "+modulo(cislo1,cislo2));
                break;
        }



    }
    public static  double scitanie(double parCislo1, double parCislo2)
    {
        return parCislo1+parCislo2;
    }

    public static  double odcitanie(double parCislo1, double parCislo2)
    {
        return parCislo1-parCislo2;
    }

    public static  double nasobenie(double parCislo1, double parCislo2)
    {
        return parCislo1*parCislo2;
    }

    public static  double delenie(double parCislo1, double parCislo2)
    {
        return parCislo1/parCislo2;
    }

    public static  double modulo(double parCislo1, double parCislo2)
    {
        return parCislo1%parCislo2;
    }
}
// TODO prerobiť na 1 metodu ktora dostane vsetko a priamo spraví výsleodk
// TODO ošetriť výnimky a chyby