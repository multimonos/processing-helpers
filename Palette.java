import processing.core.PApplet;
import java.util.ArrayList;

public class Palette {

    protected ArrayList<Swatch> swatches;

    public Palette() {
        swatches = new ArrayList<Swatch>();
    }

    public int size() {
        return swatches.size();
    }

    public void add(Swatch s) {
        swatches.add(swatches.size(), s);
    }

    public void add(int clr) {
        add(new Swatch(clr));
    }

    public ArrayList<Swatch> swatches() {
        return swatches;
    }

    public Swatch swatch(int n) {
        if ( n > swatches.size()) {
            n = swatches.size() - 1;
        } else if (n < 0) {
            n = 0;
        }
        return swatches.get(n);
    }

}