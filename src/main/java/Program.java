import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Program
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                Plansza p;
                p=new Plansza();

                JFrame jf=new JFrame();
                jf.add(p);
//                jf.setBackground(Color.red);
//                p.setBackground(Color.magenta);


                jf.setTitle("Test grafiki");
                jf.setSize(1920,1080);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.setVisible(true);

            }
        });
    }
}
