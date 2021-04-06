package Lab3.UI.Input;

import java.util.Scanner;

public class Inputs {
    Scanner in = new Scanner(System.in);

    public void Start(){
        System.out.println("Программа начала свою работу");
    }

    public int Function_selection(){
        while (true) {
            System.out.print("""
                    Выберите функцию:
                    1. -x^3-x^2+x+3
                    2. 3*x^5+0.5*x^2+0.1
                    3. sin(x)+cos(x)
                    4. x^2+10*x-6
                    Номер:\s""");
            try {
                int num_fun = Integer.parseInt(in.next().trim());
                if(num_fun == 1 || num_fun == 2 || num_fun == 3 || num_fun == 4)
                    return num_fun;
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public int InputMethod(){
        while (true) {
            System.out.print("""
                    Выбирите метод:
                    1. Метод трапеций
                    2. Метод Симсона
                    3. Метод Прямоугольников
                    номер метода:\s""");
            try {
                int num_method = Integer.parseInt(in.next().trim());
                if(num_method == 1 || num_method == 2 || num_method == 3)
                    return num_method;
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public int InputMethod_of_rectangles(){
        while (true) {
            System.out.print("""
                    Выбирите метод:
                    1. Правых прямоугольников
                    2. Левых прямоугольников
                    3. Средних прямоугольников
                    4. Все методы 
                    номер метода:\s""");
            try {
                int num_method = Integer.parseInt(in.next().trim());
                if(num_method == 1 || num_method == 2 || num_method == 3 || num_method == 4)
                    return num_method;
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public int InputA(){
        while (true) {
            System.out.print("Введите нижний предел интегрирования (Целое число) a: ");
            try {
                return Integer.parseInt(in.next().trim());
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public int InputB(){
        while (true) {
            System.out.print("Введите верхний предел интегрирования (Целое число) b: ");
            try {
                return Integer.parseInt(in.next().trim());
            } catch (NumberFormatException ignored) {
            }
        }
    }

    public double InputE(){
        while (true) {
            System.out.print("Введите точность e: ");
            try {
                return Double.parseDouble(in.next().trim().replaceAll(",", "\\."));
            } catch (NumberFormatException ignored) {
            }
        }
    }

}
