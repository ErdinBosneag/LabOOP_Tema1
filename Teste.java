import java.util.Random;
public class Teste {
    public static void main(String[] args) {
        int j = 1;
        StivaDeComparabile v = new StivaDeComparabile(4);
        v.afisareElemente();
        while(j <= 5) {
            Random random = new Random();
            Comparabil x = new Comparabil();
            x.prezenta = random.nextInt(14);
            x.nume = "Stud_ELTH_" + j;
            v.adaugareElement(x);
            j++;
        }
        v.afisareElemente();
        for(int i = 0; i < 2; i++) v.eliminareElement();
        v.afisareElemente();
        v.sortareElemente();
        v.afisareElemente();
        for(int i = 0; i < 4; i++) v.eliminareElement();
        v.afisareElemente();
    }
}
