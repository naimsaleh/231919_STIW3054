
public class MySleep extends Thread {

    public static void main(String[] args) {
        new Thread(new MySleep()).start();
    }

    @Override
    public void run() {
        try {
            for (int x = 5; x <= 100; x+=5) {
                
                if(x%2==0)
                System.out.println(x + "A");
                
                else
                System.out.println(x); 
                
                sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}