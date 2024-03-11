package metrics.graphing;

import java.util.ArrayList;
import java.util.List;

public class Sum implements NewStatistics {
    public List<Double> compute(List<Double> data) {
        List<Double> sums = new ArrayList<>();
        int segmentSize = 10;
        for (int i = 0; i < data.size(); i += segmentSize) {
            double sum = 0;
            for (int j = i; j < i + segmentSize && j < data.size(); j++) {
                sum += data.get(j);
            }
            sums.add(sum);
        }
        return sums;
    }
}
