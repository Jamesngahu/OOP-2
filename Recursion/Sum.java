package Recursion;

public class Sum {

    public static int sum(int n){

        if (n == 1) {
            return 1;
        } else {
            return n + sum(n -1);
        }
    }
    public static void main(String[] args){
        int result = sum(9);
        System.out.println("Sum:" + result);
    }
}
