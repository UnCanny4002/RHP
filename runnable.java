public class Work implements Runnable {
    int id, N;
    public Work(int id, int n) {
        this.id = id;
        this.N = n;
    }
    @Override
    public void run() {
        doWork();
    }
    private void doWork() {
        for (int ctr = 1; ctr <= N; ctr++) {
            System.out.println("Wid=" + id + " ctr=" + ctr);
        }
    }
}
class Main
  {
    public static void main(String args[])
    {
      int n=10,id=20;
      Work w=new Work(id,n);
      Thread t=new Thread(w);
      t.start();
    }
  }
