import java.awt.geom.Rectangle2D;

public class Plytka extends Rectangle2D.Float {

    public Plytka(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 600;
        this.height = 30;
    }

    public Plytka() {
    }

    public Plytka(float x, float y, float w, float h) {
        super(x, y, w, h);
//        instance = this;

    }
}
