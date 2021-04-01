package Lab3.functions;

public class Fun {
    public double f(double x, int nf){
        if(nf == 1)
            return -1*Math.pow(x,3) - Math.pow(x,2) + x + 3;
        else if(nf == 2)
            return 3*Math.pow(x,5)+0.5*Math.pow(x,2)+0.1;
        else if(nf == 3)
            return Math.sin(x)+Math.cos(x);
        else
            return Math.pow(x,2)+10*x-6;
    }
    public double f__(double x, int nf){
        if(nf == 1)
            return -1*6*x-2;
        else if(nf == 2)
            return 60*Math.pow(x,3)+1;
        else if(nf == 3)
            return -1*f(x,3);
        else
            return 2;
    }
    private double fdx(double x, int nf){
        if(nf == 1)
            return -1*Math.pow(x,4)/4-Math.pow(x,3)/3+Math.pow(x,2)/2+3*x;
        else if(nf == 2)
            return Math.pow(x,6)/2+Math.pow(x,3)/6+x/10;
        else if(nf == 3)
            return Math.sin(x)-Math.cos(x);
        else
            return Math.pow(x,3)/3+5*Math.pow(x,2)-6*x;
    }

    public double IfMax(double a, double b, int nf){return Math.abs(Math.max(f__(a,nf), f__(b,nf)));}
    public double getI(double a, double b, int nf){return fdx(b,nf)-fdx(a,nf);}
}
