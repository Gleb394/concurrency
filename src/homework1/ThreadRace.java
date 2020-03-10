package homework1;

public class ThreadRace {

    static class Task implements Runnable {
        private int counter = 0;

        @Override
        public void run() {
            while (counter <= 100) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " - " + counter);
                System.out.flush();

                counter++;

                if (counter == 100) {
                    System.out.println("finish " + Thread.currentThread().getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        Task task = new Task();
        Thread threadRacer1 = new Thread(task, "Thread1");
        Thread threadRacer2 = new Thread(task, "Thread2");

        threadRacer1.start();
        threadRacer2.start();
    }
}
