package com.company;


import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     System.out.println("-ЗАДАЧА 5-");

        /*У заданій послідовності цілих чисел знайти максимально довгу підпослідовність чисел таку,
                що кожний наступний елемент підпослідовності ділився без остатку на попередній. */

        System.out.println("Введите количество чисел: ");
        int n = in.nextInt(); // 10
        int k=0,j=0;
        int [] myArray = new int[n];
        StringBuilder s = new StringBuilder("");
        StringBuilder s2 = new StringBuilder("");

        System.out.println("Введите числа: ");
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt(); // 2, 2, 2, 5, 5, 5, 5, 5, 5, 6
        }

        for (int i=0; i<n-1; i++){

            if (myArray[i+1]%myArray[i]==0) {

                s.append(myArray[i+1]+ " ");
                k++;

                if (myArray[i+1]==myArray[myArray.length-1]){
                    if(k>j) {
                        s2.delete(0, s2.length());
                        s2.append(s);
                    }
                }
            }

            else {
                if(k>j){
                    s2.delete(0, s2.length());
                    s2.append(s);
                    j=k;
                    k=0;
                     s.delete(0, s.length()-1);

                }
                else {

                    k=0;
                    s.delete(0, s.length()-1);

                }

            }

        }
        System.out.println("Самая длинная подпоследовательность последовательности :");
        System.out.println(s2);


     }
}
