package homework2;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {

    private List<Integer> data;

    public SumTask(List<Integer> data) {
        this.data = data;
    }

    @Override
    protected Integer compute() {
        Integer sum = 0;
        for (Integer l: data) {
            sum += l;
        }
        return sum;
    }
}
