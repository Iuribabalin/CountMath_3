package Lab3.UI.Output;

public class Outputs {
    public void outSim(double e,double answer, double I, double r, long n, int iteration){
        System.out.println("------------------------------------------");
        System.out.println("Заданная точность e = " + e + " достигнута");
        System.out.printf("Is = %.10f\n", answer);
        System.out.printf("I = %.10f\n", I);
        System.out.printf("абсолютная погрешность |R| = %.10f\n", r);
        System.out.printf("относительная погрешность E = %.10f", Math.abs(100*r/((I+answer)/2)));
        System.out.println("%");
        System.out.println("n = " + n);
        System.out.println("Кол. итераций = " + iteration);
        System.out.println("------------------------------------------");
    }

    public void outTrap(double answer, double I, double r, long n){
        System.out.println("------------------------------------------");
        System.out.printf("Itr = %.4f\n",answer);
        System.out.printf("I = %.10f\n", I);
        System.out.printf("абсолютная погрешность |R| = %.10f\n", r);
        System.out.printf("относительная погрешность E = %.10f", Math.abs(100*r/((I+answer)/2)));
        System.out.println("%");
        System.out.println("n = " + n);
        System.out.println("------------------------------------------");
    }
}
