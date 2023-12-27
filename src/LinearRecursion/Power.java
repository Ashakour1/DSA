package LinearRecursion;

public class Power {
    public static void main(String[] args) {
        System.out.println("" + pow(5,1));

    }

    static double pow(double x, double n){
        if(n == 0){
            return 1;
        }else{
            return x * pow(x, n-1);
        }
    }
}
