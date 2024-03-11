package metrics.graphing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max implements NewStatistics {
    public List<Double> compute(List<Double> data) {
        List<Double> maxValues = new ArrayList<>();
        int segmentSize = 10;
        for (int i = 0; i < data.size(); i += segmentSize) {
            double max = Collections.max(data.subList(i, Math.min(i + segmentSize, data.size())));
            maxValues.add(max);
        }
        return maxValues;
    }
}
