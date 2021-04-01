package Lab3.Methods;

import Lab3.UI.Output.DrawChart;
import Lab3.UI.Output.Outputs;
import Lab3.functions.Fun;

public class Simpsons_method {
    Fun fun = new Fun();
    DrawChart draw = new DrawChart();
    Outputs out = new Outputs();

    private long getN(double a, double b, double e, int nf){
        return Math.round(Math.sqrt(fun.IfMax(a,b,nf)*Math.pow((b-a),3)/12/e));
    }
    public void startMethod(double down, double up, double e,int nf){
        double a,answer,r,I,step,x0,xn,sum_1,sum_2;
        int iteration = 0;
        long n = getN(down,up,e,nf);
        a = down; answer = 0; r = e + 1; I = fun.getI(down,up,nf);

        while(r > e) {
            step = (up-down)/n;
            x0 = fun.f(down,nf);
            a += step;
            xn = fun.f(up,nf);
            sum_1 = 0;
            sum_2 = 0;
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0)
                    sum_2 += fun.f(a,nf);
                else
                    sum_1 += fun.f(a,nf);
                a += step;
            }
            answer = step * (x0 + xn + 2 * sum_2 + 4 * sum_1) / 3;
            r = Math.abs(I-answer);
            n=n*2;
            a = down;
            iteration++;
        }

        n=n/2;
        out.outSim(e,answer,I,r,n,iteration);
        draw.draw(down,up,nf);
    }
}
