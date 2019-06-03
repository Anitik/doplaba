package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-ЗАДАЧА 5-");

        /*У заданій послідовності цілих чисел знайти максимально довгу підпослідовність чисел таку,
                що кожний наступний елемент підпослідовності ділився без остатку на попередній. */

        System.out.println("Введите количество чисел: ");
        int n = in.nextInt(); // 10
        int k = 0, j = 0;
        int[] myArray = new int[n];
        StringBuilder s = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        System.out.println("Введите числа: ");
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt(); // 2 2 2 5 5 5 5 5 5 6
        }

        for (int i = 0; i < n - 1; i++) {

            if (myArray[i + 1] % myArray[i] == 0) {

                s.append(myArray[i + 1]).append(" ");
                k++;

                if (myArray[i + 1] == myArray[myArray.length - 1]) {
                    if (k > j) {
                        s2.delete(0, s2.length());
                        s2.append(s);
                    }
                }
            } else {
                if (k > j) {
                    s2.delete(0, s2.length());
                    s2.append(s);
                    j = k;
                    k = 0;
                    s.delete(0, s.length() - 1);

                } else {

                    k = 0;
                    s.delete(0, s.length() - 1);

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
        int[][] people = new int[m][2];
        int[] time = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Музей работает с 10 до 18 часов. Время вводится целыми числами.");
        for (int i = 0; i < m; i++) {
            System.out.println("Введите время прихода и ухода " + (i + 1) + "-го посетителя:");
            people[i][0] = in.nextInt();
            people[i][1] = in.nextInt();

        }

        for (int i = 0; i < m; i++) {
            for (int l = people[i][0]; l <= people[i][1]; l++) {
                for (int r = 0; r < time.length; r++) {
                    if (l == time[r]) {
                        count[r] += 1;
                    }
                }
            }
        }


        for (int i = count.length - 1; i > 0; i--) {
            for (int y = 0; y < i; y++) {
                if (count[y] < count[y + 1]) {

                    int tmp2 = time[y];
                    time[y] = time[y + 1];
                    time[y + 1] = tmp2;

                    int tmp = count[y];
                    count[y] = count[y + 1];
                    count[y + 1] = tmp;
                }
            }
        }

        System.out.println("Самое большое количество посетителей находилось в музее в " + time[0] + " часов - " + count[0] + " человек(-а).");


        for (int i = 1; i < time.length; i++) {
            System.out.println("В " + time[i] + " часов в музее находилось " + count[i] + " человек(-а).");
        }


        System.out.println("-ЗАДАЧА 9-");

          /*Дан масив X [1..N]. Необхідно циклічно зрушити його на k елементів вправо
          (тобто елемент X [i] після зсуву повинен стояти на місці X [i + k];
          тут ми вважаємо що за X [N] слід X [1]). Додаткового масиву заводити не можна! */


        System.out.println("Введите длину массива: ");
        int b;
        b = in.nextInt();
        int[] arr = new int[b];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("Введите k: ");
        int e = in.nextInt();
        moveRight(arr, e);
        for (int i1 : arr) {
            System.out.print(i1 + " ");

        }


        System.out.println();
        System.out.println("-ЗАДАЧА 17-");

        /*Вводиться послідовність з n натуральних чисел.
        Необхідно визначити найменше натуральне число, якого немає у послідовності. */


        System.out.println("Введите количество чисел: ");
        int g = in.nextInt(); // 100
        int[] ar = new int[g];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) ((Math.random() * 99) + 1);
            System.out.print(ar[i] + " ");

        }
        int min = ar[0];
        for (int i1 : ar) {
            if (i1 < min) {
                min = i1;
            }
        }
        System.out.println();
        System.out.println("Минимальное число даной последовательности: " + min);
        for (int i = 1; i < min; i++) {
            if (i != min) {
                System.out.println("Минимальное натуральное число которого нет в даной последовательности: " + i);
                break;


            }
        }


        System.out.println("-ЗАДАЧА 19-");

        int q, w, u, r, t, y;
        int number = 0;
        for (q = 0; q < 10; q++) {
            for (w = 0; w < 10; w++) {
                for (u = 0; u < 10; u++) {
                    for (r = 0; r < 10; r++) {
                        for (t = 0; t < 10; t++) {
                            for (y = 0; y < 10; y++) {
                                if (q + w + u == r + t + y) {
                                    number += 1;
                                }

                            }

                        }

                    }

                }

            }
        }
        System.out.println("Количество шестизначных счастливых билетов : " + number);



    System.out.println("-Буфет-");

        int P=0, S=0,  Time=300, KS=0;
        int p=(int) (Math.random()*(10)+1) ;
        int students=(int) (Math.random()*(20)+1) ;
        System.out.println("Перемена длится 5 минут.");
        System.out.println("В столовую заходят преподователи:");
        int [] tp=new int[p];
        for (int i = 0; i < tp.length; i++) {
            tp[i] = ((int)(Math.random() * 20 + 10)); // от 10 до 30 сек
            try {
                Thread.sleep(500);
            } catch (Exception ee) {}
            System.out.print("(¬‿¬)"+tp[i]+" ");
        }
        System.out.println("");
        System.out.println("В столовую заходят студенты:");
        int [] ts=new int[students];
        for (int i = 0; i < ts.length; i++) {
            ts[i] = ((int)(Math.random() * 20 + 10)); // от 10 до 30 сек
            try {
                Thread.sleep(500);
            } catch (Exception ee) {}
            System.out.print("(-_・)"+ts[i]+" ");
        }
        System.out.println("");
        System.out.println("Перемена закончилась. ");
        System.out.println("B столовую пришло "+p+" преподователя(-ей) и "+s+" студента(-ов).");
        for( int i=0; i<p; i++){
            P+=tp[i];
        }
        Time-=P;
        System.out.println("Время обслуживания преподователей: " + P + " сек.");
        System.out.println("Столовая успела обслужить всех преподователей.");



        for( int i=0; i<students; i++){
            S+=ts[i];

            if (S>=Time){
                KS=i+1;
                break;

            }
            KS=i+1;
        }

        System.out.println("Время обслуживания студентов: " + (S) + " сек.");
        if (KS<students) {
            System.out.println("Столовая успела обслужить " + KS + " студента(-ов).");
            System.out.println(KS + " студента(-ов) остались голодными. ");
            for (int i=0; i<KS; i++){
                System.out.print("(T_T) ");
            }

        }
        else {
            System.out.println("Столовая успела обслужить всех студентов.");
        }
}



    private static void moveRight(int[] array, int positions) {
        int size = array.length;
        for (int i = 0; i < positions; i++) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }

    }




}
