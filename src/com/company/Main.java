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

        System.out.println("-ЗАДАЧА 8-");

/*
        У музеї реєструється протягом дня час приходу і відходу кожного відвідувача.
        Таким чином за день отримані N пар значень, де перше значення у парі показує час приходу відвідувача
        і друге значення - час його відходу. Знайти проміжок часу, протягом якого в музеї одночасно перебувало
        максимальне число відвідувачів.*/

        System.out.println("Введите количество посетителей: ");
        int m = in.nextInt(); // 10
        int people [][] = new int[m][2];
        int time [] = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        int count [] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Музей работает с 11 до 18 часов. Время вводится целыми числами.");
        for (int i=0; i<m; i++){
            System.out.println("Введите время прихода и ухода "+(i+1)+"-го посетителя:");
            people[i][0]=in.nextInt();
            people[i][1]=in.nextInt();

        }

        for (int i=0; i<m; i++){
            for (int l=people[i][0]; l<=people[i][1]; l++){
                for(int r=0; r<time.length; r++){
                    if (l==time[r]){
                        count[r]+=1;
                    }
                }
            }
        }


        for(int i = count.length-1 ; i > 0 ; i--){
            for(int y = 0 ; y < i ; y++){
            if( count[y] < count[y+1] ){

                int tmp2 = time[y];
                time[y] = time[y+1];
                time[y+1] = tmp2;

                int tmp = count[y];
                count[y] = count[y+1];
                count[y+1] = tmp;
            }
        }
    }

        System.out.println("Самое большое количество посетителей находилось в музее в "+time[0]+" часов - "+count[0]+" человек(-а).");


        for (int i=1; i<time.length; i++){
            System.out.println("В "+time[i]+" часов в музее находилось "+count[i]+" человек(-а).");
        }




     }
}
