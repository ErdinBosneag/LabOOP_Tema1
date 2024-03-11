import java.util.Random;
public class Comparabil {
    protected int prezenta;
    protected String nume;

    public int comparaCu(Comparabil x) {
        Random random =  new Random();
        return random.nextInt(3) - 1;
    }
}
