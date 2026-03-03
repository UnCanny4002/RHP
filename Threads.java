class work extends Thread {
  int n;  
  work(int x)
  {
    n=x;
  }
    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println("Thread 1: " + i);
        }
    }

    public static void main(String[] args) {
        int n=10;
        work w = new work(n);
        w.start();

        for (int i = 1; i <= 20; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
