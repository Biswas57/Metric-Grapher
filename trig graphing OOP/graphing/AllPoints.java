package metrics.graphing;

import java.util.List;

public class AllPoints implements NewStatistics {
    public List<Double> compute(List<Double> data) {
        return data;
    }
}
