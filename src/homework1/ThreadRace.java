package homework1;

public class ThreadRace {

    static class Task implements Runnable {
        int laps = 0;

        @Override
        public void run() {
            while (laps <= 100) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " - " + laps);
                System.out.flush();
                laps++;
            }
        }
    }

    public static void main(String[] args) {
        Thread threadRacer1 = new Thread(new Task(), "Thread1");
        Thread threadRacer2 = new Thread(new Task(), "Thread2");

        threadRacer1.start();
        threadRacer2.start();
    }
}
