package homework1;

public class TaskImplementsRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("start thread");
    }

    public static void main(String[] args) {
        new Thread(new TaskImplementsRunnable()).start();
    }
}