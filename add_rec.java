package com.company;

public class Main {

    public static void main(String[] args) {

        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int q)
    {
        if (q > 0)
        {
            return q + sum(q - 1);
        }
        else
        {
            return 0;
        }
    }
}

