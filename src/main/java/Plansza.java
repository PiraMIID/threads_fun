import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

class Plansza extends JPanel implements MouseMotionListener {
    Belka b;
    Kulka a1;
    Kulka a2;
    Kulka a3;
    Kulka a4;
    Kulka a5;
    Kulka a6;
    SilnikKulki s1;
    SilnikKulki s2;
    SilnikKulki s3;
    SilnikKulki s4;
    SilnikKulki s5;
    SilnikKulki s6;
    ArrayList<Plytka> pltyki;
//    Plytka p;


    Plansza() {
        super();
        addMouseMotionListener(this);

        b = new Belka(1000);
        a1 = new Kulka(this, 100, 200, 1, 1);
        a2 = new Kulka(this, 110, 200, 1, 1);
        a3 = new Kulka(this, 112, 200, 1, 1);
        a4 = new Kulka(this, 10, 200, 1, 1);
        a5 = new Kulka(this, 60, 200, 1, 1);
        a6 = new Kulka(this, 19, 200, 1, 1);


        pltyki = new ArrayList<Plytka>();
        s1 = new SilnikKulki(a1);
        s2 = new SilnikKulki(a2);
        s3 = new SilnikKulki(a3);
        s4 = new SilnikKulki(a4);
        s5 = new SilnikKulki(a5);
        s6 = new SilnikKulki(a6);

        for (int j = 0; j < 1000; j+=100) {
            for (int i = 0; i < 2000; i += 100) {
                pltyki.add(new Plytka(60 + i, 40 + j, 80, 20));
            }
        }
//        for (int i = 0; i < 9; i++) {
//            pltyki.forEach(System.out::println);
//        }
    }

    public ArrayList<Plytka> getPltyki() {
        return pltyki;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
//        g2d.setBackground(Color.PINK);
        g2d.setColor(Color.BLUE);


        pltyki.forEach(o -> g2d.fill(o));




        g2d.fill(a1);
        g2d.fill(a2);
        g2d.fill(a3);
        g2d.fill(a4);
        g2d.fill(a5);
        g2d.fill(a6);
        g2d.fill(b);
//        g2d.fill(c);

//        g2d.fill(p);
    }


    public void mouseMoved(MouseEvent e) {
        b.setX(e.getX());
//        System.out.println(b);
        repaint();
//        b.getClass()
    }

    public void mouseDragged(MouseEvent e) {

    }
}
