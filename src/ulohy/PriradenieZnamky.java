package ulohy;

/*Úloha 1: Program na priradenie známky

        Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.*/

import java.util.Scanner;

public class PriradenieZnamky {
    public static void main(String[] args) {
        double percento = 99;
        Scanner sc = new Scanner(System.in);

        while (percento >= 0) {
            percento =sc.nextDouble();
            System.out.println(percentoDoZnamky(percento));
        }

    }

    public static String percentoDoZnamky(double parPercento) {
        if (parPercento < 65)
            return "F";
        else if (parPercento >= 65 && parPercento < 75) {
            return "C";
        } else if (parPercento >= 75 && parPercento < 90) {
            return "B";
        } else if (parPercento >= 90 && parPercento <= 100){
            return "A";
        }
        else {
            return "Nesprávna hodnota";
        }
    }
}