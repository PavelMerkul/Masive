package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) { // сумму всех продаж
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public double averageSales(long[] sales) { // среднюю сумму продаж в месяц
        return (double) totalSales(sales) / sales.length;
    }

    public int monthWithMaxSales(long[] sales) { // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
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

    public int monthWithMinSales(long[] sales) { // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(long[] sales) { // кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
        double average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsAboveAverage(long[] sales) { // кол-во месяцев, в которых продажи были выше среднего (см. п.2)
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
