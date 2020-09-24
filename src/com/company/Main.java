package com.company;

public class Main {
//    public static double integrate(double start, double finish){
//
//    }
    public static void main(String[] args) {
        double start = 0;
        double finish = Math.PI/2;
        double height = 100;
        double blocksAmount = 1000;
        double step = (finish - start)/blocksAmount;
        double result = 0;
        

        for (int i = 1; i <= blocksAmount; i++) {
            double area = 0;
            if (Math.cos((start + i) * step) < height) {
                area = Math.cos((start + i) * step) * step;
            }
            else {
                area = 0.1 * step;
            }
            result += area;
        }
        System.out.println(result);
    }
}
