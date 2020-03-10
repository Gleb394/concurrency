package homework2;

import java.util.List;
import java.util.concurrent.Callable;

public class SumCalculator implements Callable<Integer> {

    private List<Integer> list;

    public SumCalculator(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
