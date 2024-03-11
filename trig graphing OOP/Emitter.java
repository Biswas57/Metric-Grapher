package metrics;

import java.util.ArrayList;
import java.util.List;

public class Emitter {
    private List<Plot> observers = new ArrayList<>();

    public void addObserver(Plot observer) {
        observers.add(observer);
    }

    public void emitMetric(double x) {
        Double metric = Math.sin(Math.toRadians(x));
        for (Plot observer : observers) {
            observer.update(metric);
        }
    }
}
