package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double [] array = new double[15];
        array[0]=2.3;
        array[1]=42.8;
        array[2]=18;
        array[3]=-20.5;
        array[4]=61.2;
        array[5]=-0.4;
        array[6]=33.3;
        array[7]=-50.7;
        array[8]=-1.8;
        array[9]=10.6;
        array[10]=4;
        array[11]=36.7;
        array[12]=-12.7;
        array[13]=-6.8;
        array[14]=21.5;

        double result = 0;
        double sum = 0;

        for (double i: array){
            if (i == array[3]){
                continue;
            } else if (i > 0.0){
                sum += i;
                System.out.println(sum);
            }

            result += i;
        }
        System.out.println(result/sum);

    }
}
