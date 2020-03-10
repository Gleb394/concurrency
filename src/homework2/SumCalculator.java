package homework2;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class SumCalculator implements Callable {

    List list;

    public SumCalculator(List list) {
        this.list = list;
    }

    @Override
    public Object call() throws Exception {
        return list.stream().collect(Collectors.summingInt(Integer::intValue));
    }
}
