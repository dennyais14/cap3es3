public class Forma{

    private final int base;
    private final int altezza;

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
