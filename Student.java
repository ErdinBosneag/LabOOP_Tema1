public class Student extends Comparabil{
    protected String nume;
    protected int prezenta;
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public int getPrezenta() {
        return prezenta;
    }
    public void setPrezenta(int prezenta) {
        this.prezenta = prezenta;
    }

    @Override
    public int comparaCu(Comparabil x) {
        if(this.prezenta == x.prezenta)return 0;
        else if(this.prezenta < x.prezenta)return -1;
        else return 1;
    }
}
