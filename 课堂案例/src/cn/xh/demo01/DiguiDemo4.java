package cn.xh.demo01;

public class DiguiDemo4 {

    public static void main(String[] args) {
        System.out.println(getSum(5));
    }

    public static int getSum(int n){
        if(n==1){
            return 1;
        }

        return n + getSum(n-1);
    }

}
