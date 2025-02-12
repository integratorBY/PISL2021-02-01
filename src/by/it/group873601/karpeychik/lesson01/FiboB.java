package by.it.group873601.karpeychik.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)
        if (n < 2) return BigInteger.valueOf(n);
        BigInteger[] fiboArray = new BigInteger[n + 1];
        fiboArray[0] = BigInteger.valueOf(0);
        fiboArray[1] = BigInteger.valueOf(1);
        for (Integer i = 2; i <= n; i++) {
            fiboArray[i] = fiboArray[i - 1].add(fiboArray[i - 2]);
        }
        return fiboArray[n];
    }

}

