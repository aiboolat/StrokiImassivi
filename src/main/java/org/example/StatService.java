package org.example;

public class StatService {
    public long sum(long[] sales) {
        long value = 0;
        for (long sale : sales) {
            value = value + sale;
        }
        return value;
    }

    public long costAverage(long[] sales) {
        return (long) ((double) sum(sales) / sales.length);
    }

    public long maxValueMounth(long[] sales) {
        long value = 0;
        int numMounth = 0;
        int indexMounth = 0;
        for (int i = 0; i < sales.length; i++) {
            long sale = sales[i];
            indexMounth++;
            if (value <= sale) {
                if (value == sale) {
                    numMounth = indexMounth;
                } else {
                    numMounth = indexMounth;
                    value = sale;
                }
            }
        }
        return numMounth;
    }

    public long minValueMounth(long[] sales) {
        long value = sales[0];
        int numMounth = 0;
        int indexMounth = 0;
        for (long sale : sales) {
            indexMounth++;
            if (value > sale) {
                numMounth = indexMounth;
                value = sale;
            }
        }
        return numMounth;
    }

    public int countMounthBelowAverage(long[] sales) {
        int value = 0;
        long average = costAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                value++;
            }
        }
        return value;
    }

    public int countMounthAboveAverage(long[] sales) {
        int value = 0;
        long average = costAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                value++;
            }
        }
        return value;
    }
}