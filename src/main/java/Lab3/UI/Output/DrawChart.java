package Lab3.UI.Output;

import Lab3.functions.Fun;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class DrawChart {
    Fun fun = new Fun();
    public void draw(double a, double b, int nf){
        XYSeries series = new XYSeries("fun");

        for(double i = a; i <= b+0.01; i+=0.01){
            series.add(i, fun.f(i,nf));
        }

        XYDataset xyDataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory
                .createXYLineChart("fun", "x", "y",
                        xyDataset,
                        PlotOrientation.VERTICAL,
                        true, true, true);
        JFrame frame =
                new JFrame("MinimalStaticChart");
        // Помещаем график на фрейм
        frame.getContentPane()
                .add(new ChartPanel(chart));
        frame.setSize(400,300);
        frame.show();
    }
}
