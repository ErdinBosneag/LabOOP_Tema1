
import java.util.Arrays;
import java.util.Scanner;
public class StivaDeComparabile {
    private int size;
    private Comparabil[] stiva;
    public StivaDeComparabile(int length) {
        this.size = 0;
        this.stiva = new Comparabil[length];
    }
    public void afisareElemente() {
        for (int i = size - 1; i >= 0; i--)
            System.out.println(stiva[i].nume + " " + stiva[i].prezenta);
        System.out.println();
    }
    public void adaugareElement(Comparabil x) {
        if (size >= stiva.length) {
            Scanner scanner = new Scanner(System.in);
            int new_length;
            do {
                System.out.println("Stiva este plina, introduceti noua dimensiune a stivei(mai mare ca " + stiva.length + "): ");
                new_length = scanner.nextInt();
            } while (new_length <= stiva.length);
            stiva = Arrays.copyOf(stiva, new_length);
        }
        stiva[size++] = x;
    }
    public Comparabil eliminareElement() {
        if(size > 0) {
            size--;
            return stiva[size];
        }
        else return null;
    }
    public void sortareElemente(){
        boolean k = true;
        while(k) {
            k = false;
            for(int i = 0; i < size - 1; i++)
                if(stiva[i].prezenta > stiva[i+1].prezenta){
                    k = true;
                    Comparabil aux = stiva[i];
                    stiva[i] = stiva[i+1];
                    stiva[i+1] = aux;
            }
        }
    }
}
