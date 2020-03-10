package homework1;

public class TaskExtendsThread extends Thread {

    @Override
    public void run() {
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        new TaskExtendsThread().start();
    }
}
