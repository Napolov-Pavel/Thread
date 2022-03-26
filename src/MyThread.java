import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    private String name;
    private int countMessage;

    public MyThread(String name) {
        this.name = name;
    }

    public Integer getCountMessage() {
        return countMessage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String call() throws Exception {
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(2000);
                System.out.printf("Я поток %s. Всем привет!\n", getName());
                countMessage++;
            }
        } catch (InterruptedException e) {

        }
        return "Самый быстрый поток - " + getName() + ", вывел " + getCountMessage() + " сообщений";
    }
}
