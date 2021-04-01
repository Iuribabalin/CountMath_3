package Lab3.Methods;

import Lab3.UI.Output.DrawChart;
import Lab3.UI.Output.Outputs;
import Lab3.functions.Fun;

public class Trapezium_method {
    Fun fun = new Fun();
    DrawChart draw = new DrawChart();
    Outputs out = new Outputs();

    public void startMethod(double down, double up, int n, int nf){
        draw.draw(down,up,nf);
        double I = fun.getI(down,up,nf);
        //double R = fun.IfMax(down,up,nf)*Math.pow((up-down),3)/12/Math.pow(n,2);
        double step = (up-down)/n;
        double y0 = fun.f(down,nf);
        down+=step;
        double yn = fun.f(up,nf);
        double sum = 0;
        for(int i = 1; i < n; i++){
            sum += fun.f(down,nf);
            down+=step;
        }
        double answer = step * ((y0+yn)/2 + sum);
        out.outTrap(answer,I,Math.abs(I-answer),n);
    }
}
