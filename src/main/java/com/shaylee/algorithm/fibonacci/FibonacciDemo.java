package com.shaylee.algorithm.fibonacci;

/**
 * Title: 斐波那契数字
 * Project: shaylee-algo
 *
 * @author Adrian
 * @date 2020-03-15
 */
public class FibonacciDemo {

    /**
     * 递归实现
     */
    public static int fibo1(int num) {
        if (num <= 1) {
            return num;
        }
        return fibo1(num - 2) + fibo1(num - 1);
    }

    /**
     * for实现
     */
    public static int fibo2(int num) {
        if (num <= 1) {
            return num;
        }
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 0; i < num-1; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }

    /**
     * 斐波那契数字 0 1 1 2 3 5 8 13 21 34 55 89
     */
    public static void main(String[] args) {
        System.out.println(FibonacciDemo.fibo1(8));
        System.out.println(FibonacciDemo.fibo2(8));
    }
}
