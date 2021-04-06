package Lab3.Methods;

import Lab3.UI.Output.DrawChart;
import Lab3.UI.Output.Outputs;
import Lab3.functions.Fun;

public class Trapezium_method {
    Fun fun = new Fun();
    DrawChart draw = new DrawChart();
    Outputs out = new Outputs();

    public void startMethod(double down, double up, double e, int nf){
        draw.draw(down,up,nf);
        double I = fun.getI(down,up,nf),step,save_down = down,y0,yn,sum,r = e+1,answer = 0;
        long n = 2;
        //double R = fun.IfMax(down,up,nf)*Math.pow((up-down),3)/12/Math.pow(n,2);
        while(r > e) {
            n*=2;
            step = (up - down) / n;
            y0 = fun.f(down, nf);
            down += step;
            yn = fun.f(up, nf);
            sum = 0;
            for (int i = 1; i < n; i++) {
                sum += fun.f(down, nf);
                down += step;
            }
            answer = step * ((y0 + yn) / 2 + sum);
            r = Math.abs(I-answer);
            down = save_down;
        }
        out.outAnswer(e,answer,I,r,n);
    }
}
