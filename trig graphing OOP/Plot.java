package metrics;

import java.util.ArrayList;
import java.util.List;

import metrics.graphing.Panel;

public class Plot {
    private Panel panel;
    private List<Double> metrics = new ArrayList<>();

    public void update(Double newMetric) {
        metrics.add(newMetric);
        if (panel != null)
            panel.repaint();
    }

    private int range = 150;

    public Panel getPanel() {
        return panel;
    }

    public void setPanel(Panel panel) {
        this.panel = panel;
    }

    public List<Double> getData() {
        List<Double> newList = new ArrayList<>(metrics);
        if (newList.size() > range) {
            newList = newList.subList(newList.size() - range - 1, newList.size() - 1);
        }
        return newList;
    }
}
