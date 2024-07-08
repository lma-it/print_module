package print_module;

import java.util.Arrays;

/**
 * ENG:
 * For use this module in your project just write:
 *      import static print_module.print_library.print;
 *      import static print_module.print_library.printf;
 *      import static print_module.print_library.println;
 * RU:
 * Для использования данного модуля в своем проекте просто пропишите:
 *      import static print_module.print_library.print;
 *      import static print_module.print_library.printf;
 *      import static print_module.print_library.println;
 */

public class print_library {
    public static void print(int[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void println(int[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void print(int x){
        System.out.print(x + " ");
    }

    public static void println(int x){
        System.out.println(x);
    }

    public static void print(long x){
        System.out.print(x + " ");
    }

    public static void println(long x){
        System.out.println(x);
    }

    public static void print(short x){
        System.out.print(x + " ");
    }

    public static void println(short x){
        System.out.println(x);
    }

    public static void print(char x){
        System.out.println(x);
    }

    public static void println(char x){
        System.out.println(x);
    }

    public static void print(float x){
        System.out.print(x + " ");
    }

    public static void println(float x){
        System.out.println(x);
    }

    public static void print(double x){
        System.out.print(x + " ");
    }

    public static void println(double x){
        System.out.println(x);
    }

    public static void print(boolean x){
        System.out.print(x + " ");
    }

    public static void println(boolean x){
        System.out.println(x);
    }

    public static void print(double[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void println(double[] x){
        System.out.println(Arrays.toString(x)); 
    }

    public static void print(String[] x){
        String last_string = x[x.length-1];
        for (String string : x) {
            if(string != last_string) System.out.print(string + " ");
            if(string == last_string) System.out.print(string + "\n");
        }   
    }

    public static void println(String[] x){
        for (String string : x) {
            System.out.println(string);
        }   
    }

    public static void print(String x){
        System.out.print(x + " ");
    }

    public static void println(String x){
        System.out.println(x);
    }

    public static void print(float[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void println(float[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void print(char[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void println(char[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void print(long[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void println(long[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void print(short[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void println(short[] x){
        System.out.println(Arrays.toString(x)); 
    }

    public static void print(){
        System.out.print("");
    }

    public static void print(Object object){
        System.out.print(object);
    }

    public static void print(Runnable function){
        function.run();
    }

    public static void println(){
        System.out.println("");
    }

    public static void println(Object object){
        System.out.println(object);
    }

    public static void printf(String f_string){
        System.out.printf(f_string + "\n");
    }

    public static void printf(String f_string, Object... args) {
        String formated_string = String.format(f_string, args);
        System.out.printf(formated_string + "\n");
    }

    // public static void printf(String f_string, Object object) {
    //     System.out.printf(f_string +  object + "\n");
    // }

}
