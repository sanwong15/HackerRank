/*
San Wong
hswong1@uci.edu

Fibonacci Modified
Given the nth and (n+1)th terms, the (n+2)th can be computed by the following relation 
Tn+2 = (Tn+1)2 + Tn

Given three integers A, B and N, such that the first two terms of the series (1st and 2nd terms) are A and B respectively, compute the Nth term of the series.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        
        System.out.println(fibonacciModified(A,B,N));
    }
    
    public static int fibonacciModified(int A, int B, int N){
        int fib[] = new int[N+1];
        fib[0] = 0;
        fib[1] = A;
        fib[2] = B;
        
        for(int i=3; i<=N; i++){
            fib[i] = (int)Math.pow(fib[i-1],2) + fib[i-2];
        }
        
        return fib[N];
        
    }
}