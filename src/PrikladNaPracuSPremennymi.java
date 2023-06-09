import java.text.SimpleDateFormat;
import java.util.Date;

public class PrikladNaPracuSPremennymi {

//    Vypíšte do konzoly nasledujúci text:
//
//    Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
//    V Bratislave dňa 18.06.2022
//    Poznámka: Dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).
//
    public static void main(String[] args) {

        String datumNar = "3.4.2000";
        float znamka = 2;
        int rok = 2022;
        String meno = " Jozef Mrkvička";

        Date dnesnyDatum = new Date();
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Študent"+meno + "sa narodil "+datumNar + ", z maturitnej skúšky má známku "+znamka+"a od septembra"+rok+" nastúpi do nového zamestnania ako Java programator.");
        System.out.println();
        System.out.println("V Bratislave dňa "+formatDatumu.format(dnesnyDatum));

    }


}
