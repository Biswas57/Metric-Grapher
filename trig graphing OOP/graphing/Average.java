package metrics.graphing;

import java.util.ArrayList;
import java.util.List;

public class Average implements NewStatistics {
    public List<Double> compute(List<Double> data) {
        List<Double> averages = new ArrayList<>();
        int segmentSize = 10;
        for (int i = 0; i < data.size(); i += segmentSize) {
            double sum = 0;
            int count = 0;
            for (int j = i; j < i + segmentSize && j < data.size(); j++) {
                sum += data.get(j);
                count++;
            }
            averages.add(sum / count);
        }
        return averages;
    }
}
