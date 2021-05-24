import java.awt.geom.Rectangle2D;

class Belka extends Rectangle2D.Float
{
    private static Belka istannce;

    Belka(int x)
    {
        this.x=x;
        this.y=970;
        this.width=120;
        this.height=20;
        istannce = this;
    }
    public static Belka getInstance() {
        if (istannce==null) {
            return null;
        }
        return istannce;
    }

    void setX(int x)
    {
        this.x=x;
    }

}
