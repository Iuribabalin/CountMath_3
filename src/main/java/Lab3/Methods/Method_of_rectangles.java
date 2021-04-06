package Lab3.Methods;

import Lab3.UI.Output.Outputs;
import Lab3.functions.Fun;

public class Method_of_rectangles {
    Fun fun = new Fun();
    Outputs out = new Outputs();

    public void startMethod_mid(double down, double up, double e, int nf){
        double a = down, step, sum = 0,r=e+1,I=fun.getI(down,up,nf);
        long n = 2;
        while(r > e) {
            n*=2;
            step = (up - a) / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += fun.f(a + step / 2, nf);
                a += step;
            }
            sum = sum * step;
            r = Math.abs(I-sum);
            a = down;
        }
        out.outAnswer(e,sum,I,r,n);
    }

    public void startMethod_left(double down, double up, double e, int nf){
        double a = down, step, sum = 0,r=e+1,I=fun.getI(down,up,nf);
        long n = 2;
        while(r > e) {
            n*=2;
            step = (up - a) / n;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += fun.f(a,nf);
                a += step;
            }
            sum = sum * step;
            r = Math.abs(I-sum);
            a = down;
        }
        out.outAnswer(e,sum,I,r,n);
    }
    public void startMethod_right(double down, double up, double e, int nf){
        double a = down, step, sum = 0,r=e+1,I=fun.getI(down,up,nf);
        long n = 2;
        while(r > e) {
            n*=2;
            step = (up-a)/n;
            a+=step;
            sum = 0;
            for(int i = 0; i < n; i++){
                sum += fun.f(a,nf);
                a+=step;
            }
            sum = sum * step;
            r = Math.abs(I-sum);
            a = down;
        }
        out.outAnswer(e,sum,I,r,n);
    }
}
