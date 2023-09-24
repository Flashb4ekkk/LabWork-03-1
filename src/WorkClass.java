import java.util.Scanner;

public class WorkClass {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Input x");
        double x = skan.nextDouble();
        double y = 0, A = 2 * Math.abs(5 - x);

        //спосіб 1
        if(x <= -1){
            y = A - Math.exp(Math.abs(2+x));
        }
        if(x > -1 & x < 1){
            y = A - Math.pow(Math.sin(1 / Math.abs(2 + x)), 2);
        }
        if(x >= 1){
            y = A - (Math.pow(Math.cos(x), 2)) / (1 + Math.abs(Math.sin(x)));
        }
        System.out.println("result of first method: " + Math.round(y*100000.0)/100000.0);

        //спосіб 2
        if(x <= -1){
            y = A - Math.exp(Math.abs(2+x));
        } else if(x > -1 & x < 1){
            y = A - Math.pow(Math.sin(1 / Math.abs(2 + x)), 2);
        }else {
            y = A - (Math.pow(Math.cos(x), 2)) / (1 + Math.abs(Math.sin(x)));
        }
        System.out.println("result of second method: " + Math.round(y*100000.0)/100000.0);;
    }
}
