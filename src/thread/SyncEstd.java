package thread;
 class Alpha{
   synchronized public void capitalize() throws InterruptedException {
         for (int i = 65; i <=90; i++) {
             System.out.println((char)i);
             Thread.sleep(500);
         }
     }

    synchronized public void lowercase() throws InterruptedException {
         for (int i = 97; i <=122; i++) {
             System.out.println((char)i);
             Thread.sleep(500);
         }
     }
 }

public class SyncEstd {


    public static void main(String[] args) {

        Alpha c = new Alpha();
        Thread t1 = new Thread(() -> {
            try {
                c.capitalize();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                c.lowercase();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
