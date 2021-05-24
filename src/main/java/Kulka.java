import static java.lang.Math.random;

import java.awt.geom.Ellipse2D;
import java.util.ArrayList;


class Kulka extends Ellipse2D.Float {
    Belka b = Belka.getInstance();
    Plansza p;
    int dx, dy;

    ArrayList<Plytka> plytkaArrayList;
    int j;

    float r = 1;
    float s;


    Kulka(Plansza p, int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.width = 10;
        this.height = 10;

        this.p = p;
        this.dx = dx;
        this.dy = dy;


    }

    void nextKrok() {
        plytkaArrayList = p.getPltyki();
        j = plytkaArrayList.size();


        x += dx * r;
        y += dy;


        if (getMinX() < 0 || getMaxX() > p.getWidth()) dx = -dx;
        if (getMinY() < 0 || getMaxY() > p.getHeight()) dy = -dy;

        if (b.contains(x, y)) {
            s = b.width / 2;
            r = (x - b.x- s )/s;
            if (x <= s) {
//                r = 2*(s - (x - b.x)) / s;
                if (dx < 0) {
                    dx = -dx;
                }
            } else {
////                r = 2*(x - (b.x + s)) / s;
                if (dx < 0) {
                    dx = -dx;
                }
            }
//            System.out.println(r);
            dy = -dy;

        }

        for (int i = 0; i < j; i++) {
            if (plytkaArrayList.get(i).x < 0) {
                plytkaArrayList.get(i).x+=1;
            }else if (p.getWidth() < plytkaArrayList.get(i).getMaxX()) {
                plytkaArrayList.get(i).x-=1;
            } else {
                plytkaArrayList.get(i).x+=random()>=0.5 ? -1 : 1;
//                plytkaArrayList.get(i).x+=random()>=0.5 ? -1 : 1;
//                System.out.println("-"+plytkaArrayList.get(i).x);
            }
            if (plytkaArrayList.get(i).y < 0) {
                plytkaArrayList.get(i).y+=1;
            }else if (p.getHeight()-50 < plytkaArrayList.get(i).getMaxY()+100) {
                plytkaArrayList.get(i).y-=1;
            } else {
                plytkaArrayList.get(i).y+=random()>=0.5 ? -1 : 1;
            }
        }


        for (int i = 0; i < j; i++) {
            if (plytkaArrayList.get(i).contains(x, y) && plytkaArrayList.get(i) != null) {
                j -= 1;
                if (plytkaArrayList.get(i).x == x || plytkaArrayList.get(i).x + plytkaArrayList.get(i).height == x) {
                    dx = -dx;
                } else {
                    dy = -dy;
                }
                plytkaArrayList.remove(i);
            }
        }
        p.repaint();
    }
}
