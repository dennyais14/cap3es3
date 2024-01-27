public class Forma{

    private int base;
    private int altezza;

    public Forma(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int calcolaArea(int base, int altezza){
        return base * altezza;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
