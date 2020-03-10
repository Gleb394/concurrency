package homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class CalculateListViaForkJoin {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        IntStream.range(1, 1000000).forEach(list::add);

        ForkJoinPool pool = new ForkJoinPool();
        RecursiveTask<Integer> sumTask = new SumTask(list);
        System.out.println(pool.invoke(sumTask));
    }
}
