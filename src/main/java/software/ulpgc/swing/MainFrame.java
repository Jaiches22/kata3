package software.ulpgc.swing;

import software.ulpgc.HistogramDisplay;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private HistogramDisplay histogramDisplay;

    public MainFrame() {
        setTitle("Histogram");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JFreePanelHistogramDisplay display = new JFreePanelHistogramDisplay();
        histogramDisplay = display;
        return display;
    }

    public HistogramDisplay getHistogramDisplay() {
        return histogramDisplay;
    }
}
