package software.ulpgc;

import software.ulpgc.swing.MainFrame;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram("Example", "X", "Y", new double[]{1,6,8,4,5,6,11,3,7,6,4}, 3);
        MainFrame frame = new MainFrame();
        frame.getHistogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}