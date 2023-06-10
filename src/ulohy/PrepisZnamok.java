package ulohy;

//Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný, dobrý, dostatočný, nedostatočný vypíše zodpovedajúcu známku čiže 1, 2, 3, 4, 5.

import java.util.Scanner;

public class PrepisZnamok {

    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        String textZnamka = citac.nextLine();
        if (konvertuj(textZnamka)==0)
        System.out.println("Nesprávny text");
        else System.out.println("Zadané bolo "+textZnamka+" čo znamená známku : "+konvertuj(textZnamka));

    }

    public static int konvertuj (String parZnamka) {
    switch (parZnamka){
        case "výborný":
            return 1;
        case "chválitebný":
            return 2;
        case "dobrý":
            return 3;
        case "dostatočný":
            return 4;
        case "nedostatočný":
            return 5;
        default:return 0;
    }
}
}

