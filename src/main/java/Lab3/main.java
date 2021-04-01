package Lab3;
import Lab3.Methods.Simpsons_method;
import Lab3.Methods.Trapezium_method;
import Lab3.UI.Input.Inputs;

public class main {
    public static void main(String[] args){
        Inputs in = new Inputs();
        Simpsons_method s_method = new Simpsons_method();
        Trapezium_method t_method = new Trapezium_method();
        in.Start();
        try {
            while (true) {
                int num_fun = in.Function_selection();
                int num_method = in.InputMethod();
                if (num_method == 1) {
                    t_method.startMethod(in.InputA(), in.InputB(), 10, num_fun);
                } else {
                    s_method.startMethod(in.InputA(), in.InputB(), in.InputE(), num_fun);
                }
            }
        }catch (java.util.NoSuchElementException ex){
            System.out.println("ВсегО хОрОшЕгО");
        }
    }
}
