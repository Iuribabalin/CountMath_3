package Lab3;
import Lab3.Methods.Method_of_rectangles;
import Lab3.Methods.Simpsons_method;
import Lab3.Methods.Trapezium_method;
import Lab3.UI.Input.Inputs;
import Lab3.UI.Output.DrawChart;

public class main {
    public static void main(String[] args){
        Inputs in = new Inputs();
        Simpsons_method s_method = new Simpsons_method();
        Trapezium_method t_method = new Trapezium_method();
        Method_of_rectangles method_of_rectangles = new Method_of_rectangles();
        in.Start();
        try {
            while (true) {
                int num_fun = in.Function_selection();
                int num_method = in.InputMethod();
                if (num_method == 1) {
                    t_method.startMethod(in.InputA(), in.InputB(), in.InputE(), num_fun);
                }else if(num_method == 2) {
                    s_method.startMethod(in.InputA(), in.InputB(), in.InputE(), num_fun);
                }else{
                    int num_method_of_rectangles = in.InputMethod_of_rectangles();
                    double a = in.InputA(), b = in.InputB(), e = in.InputE();
                    DrawChart draw = new DrawChart();
                    draw.draw(a,b,num_fun);
                    if(num_method_of_rectangles == 1){
                        method_of_rectangles.startMethod_right(a,b,e,num_fun);
                    }else if(num_method_of_rectangles == 2){
                        method_of_rectangles.startMethod_left(a,b,e,num_fun);
                    }else if(num_method_of_rectangles == 3){
                        method_of_rectangles.startMethod_mid(a,b,e,num_fun);
                    }else{
                        method_of_rectangles.startMethod_right(a,b,e,num_fun);
                        method_of_rectangles.startMethod_left(a,b,e,num_fun);
                        method_of_rectangles.startMethod_mid(a,b,e,num_fun);
                    }
                }
            }
        }catch (java.util.NoSuchElementException ex){
            System.out.println("ВсегО хОрОшЕгО");
        }
    }
}
