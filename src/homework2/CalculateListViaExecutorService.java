package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CalculateListViaExecutorService {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        IntStream.range(1, 1000000).forEach(list::add);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Callable<Integer> sumCalculator = new SumCalculator(list);

        Future<Integer> result = executorService.submit(sumCalculator);

        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            result.isDone();
        }
    }
}
