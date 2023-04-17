import com.sun.prism.Texture;

public class Vechicle {

    private int passagers;
    private int fuelCap;
    private int usage;


    public Vechicle(int passagers, int fuelCap, int usage) {
        this.passagers = passagers;
        this.fuelCap = fuelCap;
        this.usage = usage;
    }

    public int range(){
        int range1;

        range1 = (100*fuelCap)/getUsage();

                return range1;
    }

    public int getPassagers() {
        return passagers;
    }

    public void setPassagers(int passagers) {
        this.passagers = passagers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }
}
