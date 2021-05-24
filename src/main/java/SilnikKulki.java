class SilnikKulki extends Thread
{
    Kulka a;


    SilnikKulki(Kulka a)
    {
        this.a=a;
        start();
    }



    public void run()
    {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(true)
        {
//            a.nextKrok();
//            System.out.println(Thread.currentThread().getThreadGroup());
//            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName());
            synchronized (Thread.class) {
                a.nextKrok();

            }
            try {
                sleep(0,1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
