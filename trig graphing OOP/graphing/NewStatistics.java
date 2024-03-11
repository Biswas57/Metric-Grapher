package metrics.graphing;

import java.util.List;

public interface NewStatistics {
    List<Double> compute(List<Double> data);
}
