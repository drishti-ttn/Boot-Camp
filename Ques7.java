import java.util.concurrent.*;

class Product implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(200);
        return table();
    }

    private Integer table() {
        int num = 5;
        int result = 1;
        System.out.println("Printing table");
        for (int i = 1; i <= 10; i++) {

            System.out.println(num * i);
            result = num * i;
        }
        return result;

    }
}

public class Ques7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Table of 5 ");
        Future<Integer> fut = executorService.submit(new Product());

        Integer answer = fut.get();
        executorService.shutdown();
    }
}

