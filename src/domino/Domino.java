package domino;

import java.util.Scanner;

/**
 * Дана прямоугольная клеточная доска размера M × N клеток.
 * Также дано неограниченное количество стандартных доминошек размера 2 × 1 клетку.
 * Доминошки можно поворачивать.
 * Требуется уложить как можно больше доминошек на доску так, чтобы соблюдались следующие условия:
 * <p>
 * 1. Каждая доминошка полностью покрывает две клетки доски.
 * <p>
 * 2. Никакие две доминошки не перекрываются.
 * <p>
 * 3. Каждая доминошка полностью лежит внутри доски. Касание краев доски допускается.
 * <p>
 * Найдите максимальное количество доминошек, которое можно уложить с данными ограничениями.
 * <p>
 * Входные данные
 * В единственной строке записано два целых числа M и N — размеры доски в клетках (1 ≤ M ≤ N ≤ 16).
 * <p>
 * Выходные данные
 * Выведите одно число — максимальное количество доминошек, которое можно уложить.
 */
public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println((n * m) / 2);
    }
}