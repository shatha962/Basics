import java.util.ArrayList;
public class BasicJava {
    public static void main(String[] args) {
       print();
       printodd();
       printsum();
       int[] myArray = {1,3,5,7,9,13};
       iterating(myArray);
       findMax(myArray);
       int[] myArray1 = {2, 10, 3};
       getAvg(myArray1);
       arrauOdd(); 
       greaterY(myArray , 5);
       square(myArray1);
       int[] myArray2 = {2, -10, 3};
       eliminate(myArray2);
       maxMinAvg(myArray);
       shift(myArray);
    }
    public static void print() {
        for (int i=1;i<256;i++){
            System.out.println(i);
        }
    }
    public static void printodd() {
        for (int i=1;i<256;i++){
            if (i % 2 == 1){
            System.out.println(i);
        }
        }
    }
    public static void printsum() {
        int sum =0;
        for (int i=0;i<256;i++){
            sum = sum + i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }
    public static void iterating(int[] x ) {
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    public static void findMax(int[] x ) {
        int max = x[0];
        for (int i=1;i<x.length;i++){
            if (x[i] > max){
                max = x[i];
            }
        }
        System.out.println(max);
    }
    public static void getAvg(int[] x ) {
        int sum = 0;
        for (int i=0;i<x.length;i++){
            sum = sum + x[i];
        }
        double avg = sum / x.length;
        System.out.println(avg);
    }
    public static void arrauOdd() {
        ArrayList<Object> y = new ArrayList<Object>();
        for (int i=1;i<256;i++){
            if (i % 2 == 1){
                y.add (i);
            }
        }
        System.out.println(y);
    }
    public static void greaterY(int[] array , int y) {
        int count = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] > y){
                count += 1;
            }
        }
        System.out.println(count);
    }
    public static void square(int[] x) {
        for (int i=0; i < x.length; i++){
            x[i] = x[i] * x[i];
        }
        System.out.println(java.util.Arrays.toString(x));
    }
    public static void eliminate(int[] x) {
        for (int i=0;i<x.length;i++){
            if (x[i] < 0){
                x[i] = 0;
            }
        }
        System.out.println(java.util.Arrays.toString(x));
    }
    public static void maxMinAvg(int[] x ) {
        int max = x[0];
        for (int i=1;i<x.length;i++){
            if (x[i] > max){
                max = x[i];
            }
        }
        int min = x[0];
        for (int i=1;i<x.length;i++){
            if (x[i] < min){
                min = x[i];
            }
        }
        int sum = 0;
        for (int i=0;i<x.length;i++){
            sum = sum + x[i];
        }
        double avg = sum / x.length;
        double[] myArray3 = {max,min,avg};
        System.out.println(java.util.Arrays.toString(myArray3));
    }
    public static void shift(int[] x) {
        for (int i=0;i<x.length-1;i++){
            x[i] = x[i+1];
        }
        x[x.length-1] = 0;
        System.out.println(java.util.Arrays.toString(x));
    }
}