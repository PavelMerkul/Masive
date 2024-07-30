public class Main {
    public static void main(String[] args) {
        ru.netology.stats.StatsService statsService = new ru.netology.stats.StatsService();
        // long[] sales = {100000, 150000, 200000, 120000, 180000, 250000, 300000, 140000, 160000, 220000, 210000, 190000};
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
// 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        System.out.println("Общая выручка: " + statsService.totalSales(sales));
        System.out.println("Средняя выручка: " + statsService.averageSales(sales));
        System.out.println("Месяц с максимальной выручкой: " + statsService.monthWithMaxSales(sales));
        System.out.println("Месяц с минимальной выручкой: " + statsService.monthWithMinSales(sales));
        System.out.println("Месяцы с выручкой ниже среднего: " + statsService.monthsBelowAverage(sales));
        System.out.println("Месяцы с выручкой выше среднего: " + statsService.monthsAboveAverage(sales));
    }
}
