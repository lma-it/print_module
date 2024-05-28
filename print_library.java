package print;

public class print_library {
    public static void print(int[] x){
        System.out.print(x + " ");
    }
    public static void print(int x){
        System.out.print(x + " ");
    }
    public static void print(long x){
        System.out.print(x + " ");
    }
    public static void print(short x){
        System.out.print(x + " ");
    }
    public static void print(char x){
        System.out.print(x + " ");
    }
    public static void print(float x){
        System.out.print(x + " ");
    }
    public static void print(double x){
        System.out.print(x + " ");
    }
    public static void print(boolean x){
        System.out.print(x + " ");
    }
    public static void print(double[] x){
        for (double d : x) {
            System.out.print(d + " ");
        }   
    }
    public static void print(String[] x){
        for (String string : x) {
            System.out.print(string + " ");
        }   
    }
    public static void print(String x){
        System.out.print(x + " ");
    }
    public static void print(float[] x){
        for (float f : x) {
            System.out.print(f + " ");
        }  
    }
    public static void print(char[] x){
        for (char c : x) {
            System.out.print(String.valueOf(c) + " ");
        }  
    }
    public static void print(long[] x){
        for (long l : x) {
            System.out.print(l + " ");
        }  
    }
    public static void print(short[] x){
        for (short s : x) {
            System.out.print(s + " ");
        }   
    }

}
