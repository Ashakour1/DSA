package BinaryRecursion;

public class fibonnaci {
    public static void main(String[] args) {

        System.out.println(fibonnaciSerious(6));
    }

    static int fibonnaciSerious(int index){
        if(index <= 1)
            return index;
        else
            return fibonnaciSerious(index - 2) + fibonnaciSerious(index - 1);
    }
}
