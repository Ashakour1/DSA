package LinearRecursion;

public class SumOfArray {
    public static void main(String[] args) {
        int [] Numbers = {1,2,3,4,5,6};
        System.out.println(LinearSum(Numbers,Numbers.length-1));

    }
    static int LinearSum(int[] data, int n){
        if(n == 0)
            return data[n];
        else
            return data[n] + LinearSum(data , n-1);
    }
}
