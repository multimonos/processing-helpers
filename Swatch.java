import processing.core.PApplet;

public class Swatch {

    int clr;

    public Swatch(int clr) {
        this.clr = clr;
    }

    public Swatch(int r, int g, int b) {
        this.clr = pack(r, g, b, 255);
    }

    public Swatch(int r, int g, int b, int alpha) {
        this.clr = pack(r, g, b, alpha);
    }

    public int clr() {
        return this.clr;
    }

    public int alpha(int a) {
        // unpack a color just like PApplet.color();
        int r = (clr >> 16) & 0xff;
        int g = (clr >> 8) & 0xff;
        int b = clr & 0xff;

        return pack(r, g, b, a);
    }

    public static int pack(int r, int g, int b, int a) {
        // pack a clr just like PApplet.color();
        a = a << 24;
        r = r << 16;
        g = g << 8;

        return (a | r | g | b);
    }

}