public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        System.out.printf("Создаю потоки...\n");
        new MyThread(myGroup, "1").start();
        new MyThread(myGroup,"2").start();
        new MyThread(myGroup, "3").start();
        new MyThread(myGroup, "4").start();
        Thread.sleep(15000);
        System.out.printf("Завершаю потоки.\n");
        myGroup.interrupt();
    }
}
