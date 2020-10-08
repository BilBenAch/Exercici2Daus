import java.util.Random;

public class Dau {
    private int dau;

    public Dau(int dau) {

        this.dau = dau;
    }

    public Dau() {

    }

    public int tirar(){
        dau = (int)(Math.random()*6+1);
        return dau;
    }
    public int getDau() {
        return dau;
    }

    public void setDau(int dau) {
        this.dau = dau;
    }

    @Override
    public String toString() {
        return "Dau{" +
                "dau=" + dau +
                '}';
    }
}
