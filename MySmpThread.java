class MySmpThread extends Thread{
    public static int myCount = 0;
    public void run(){
        while(MySmpThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MySmpThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    }
}
public class RunThread {
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        MySmpThread mst = new MySmpThread();
        mst.start();
        while(MySmpThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MySmpThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}