package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldCalculateTotalSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.totalSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15.0;

        double actual = service.averageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMaxSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.monthWithMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMinSales() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthWithMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthsBelowAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 4;

        int actual = service.monthsBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthsAboveAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.monthsAboveAverage(sales);

        assertEquals(expected, actual);
    }

}
