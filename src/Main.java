import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        final ExecutorService threadPool = Executors.newFixedThreadPool(4);
        List<MyThread> list = new ArrayList<>();
        list.add(new MyThread("1"));
        list.add(new MyThread("2"));
        list.add(new MyThread("3"));
        list.add(new MyThread("4"));
        System.out.println(threadPool.invokeAny(list));
        threadPool.shutdown();
    }
}
