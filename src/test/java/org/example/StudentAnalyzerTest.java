package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // =============================
    // TEST countExcellentStudents
    // =============================

    // Trường hợp bình thường (hợp lệ + không hợp lệ)
    @Test
    void testCountExcellentStudents_Normal() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    // Tất cả hợp lệ
    @Test
    void testCountExcellentStudents_AllValid() {
        List<Double> scores = Arrays.asList(8.0, 9.0, 10.0, 7.5);
        assertEquals(3, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp biên: danh sách trống
    @Test
    void testCountExcellentStudents_Empty() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    // Trường hợp biên: chỉ 0 và 10
    @Test
    void testCountExcellentStudents_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(1, analyzer.countExcellentStudents(scores));
    }

    // Trường hợp ngoại lệ: toàn bộ sai
    @Test
    void testCountExcellentStudents_InvalidOnly() {
        List<Double> scores = Arrays.asList(-5.0, 12.0);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    // =============================
    // TEST calculateValidAverage
    // =============================

    // Bình thường
    @Test
    void testCalculateValidAverage_Normal() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }

    // Tất cả hợp lệ
    @Test
    void testCalculateValidAverage_AllValid() {
        List<Double> scores = Arrays.asList(8.0, 9.0, 10.0);
        assertEquals(9.0, analyzer.calculateValidAverage(scores), 0.001);
    }

    // Danh sách trống
    @Test
    void testCalculateValidAverage_Empty() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001);
    }

    // Biên: 0 và 10
    @Test
    void testCalculateValidAverage_BoundaryValues() {
        List<Double> scores = Arrays.asList(0.0, 10.0);
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.001);
    }

    // Ngoại lệ: toàn bộ sai
    @Test
    void testCalculateValidAverage_InvalidOnly() {
        List<Double> scores = Arrays.asList(-2.0, 20.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.001);
    }
}