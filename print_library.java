package print_module;
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
        int last_item = x[x.length-1];
        for (int i : x) {
            if (i != last_item) System.out.print(i + " ");
            if (i == last_item) System.out.print(i + "\n");
        }
    }

    public static void println(int[] x){
        for (int i : x) {
            System.out.println(i);
        }
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
        System.out.print(x + " ");
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
        double last_item = x[x.length - 1];
        for (double d : x) {
            if (d != last_item) System.out.print(d + " ");
            if (d == last_item) System.out.print(d + "\n");
        }   
    }

    public static void println(double[] x){
        for (double d : x) {
            System.out.println(d);
        }   
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
        float last_item = x[x.length - 1];
        for (float f : x) {
            if (f != last_item) System.out.print(f + " ");
            if (f == last_item) System.out.print(f + "\n");
        }  
    }

    public static void println(float[] x){
        for (float f : x) {
            System.out.println(f);
        }  
    }

    public static void print(char[] x){
        char last_char = x[x.length - 1];
        for (char c : x) {
            if (c != last_char) System.out.print(String.valueOf(c) + " ");
            if (c == last_char) System.out.print(String.valueOf(c) + "\n");
        }  
    }

    public static void println(char[] x){
        for (char c : x) {
            System.out.println(String.valueOf(c));
        }  
    }

    public static void print(long[] x){
        long last_item = x[x.length - 1];
        for (long l : x) {
            if (l != last_item) System.out.print(l + " ");
            if (l == last_item) System.out.print(l + "\n");
        }  
    }

    public static void println(long[] x){
        for (long l : x) {
            System.out.println(l);
        }  
    }

    public static void print(short[] x){
        short last_item = x[x.length - 1];
        for (short s : x) {
            if (s != last_item) System.out.print(s + " ");
            if (s == last_item) System.out.print(s + "\n");
        }   
    }

    public static void println(short[] x){
        for (short s : x) {
            System.out.println(s);
        }   
    }

    public static void print(){
        System.out.print("");
    }

    public static void println(){
        System.out.println("");
    }

    public static void printf(String f_string){
        System.out.printf(f_string + "\n");
    }

    public static void printf(String f_string, Object... args) {
        String formated_string = String.format(f_string, args);
        System.out.printf(formated_string + "\n");
    }

}
