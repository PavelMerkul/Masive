package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public double averageSales(long[] sales) {
        return (double) totalSales(sales) / sales.length;
    }

    public int monthWithMaxSales(long[] sales) {
        int maxMonth = 0;
        long maxSales = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthWithMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        double average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsAboveAverage(long[] sales) {
        double average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
