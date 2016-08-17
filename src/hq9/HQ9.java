package hq9;

/**
 * Author: hetsketch
 * Created: 8/17/2016
 */

import java.util.Scanner;

/**
 * HQ9+ — шуточный язык программирования, состоящий всего из четырех односимвольных команд:
 * <p>
 * «H» печатает «Hello, World!»,
 * «Q» печатает исходный код самой программы,
 * «9» печатает текст песни «99 бутылок пива»,
 * «+» увеличивает на единицу значение внутреннего счетчика.
 * Команды «H» и «Q» воспринимаются только в верхнем регистре. Все символы программы, не являющиеся командами, игнорируются.
 * <p>
 * Вам дана программа на HQ9+. Определите, будет ли что-то напечатано в результате ее выполнения.
 * <p>
 * Входные данные
 * В единственной строке входных данных задана строка p — программа на языке HQ9+. Строка p содержит от 1 до 100
 * символов, включительно. ASCII-код каждого символа будет от 33 (восклицательный знак) до 126 (тильда), включительно.
 * <p>
 * Выходные данные
 * Выведите «YES», если в результате выполнения программы будет напечатано какое-то сообщение, и «NO» в противном случае.
 */
public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if (line.contains("H") || line.contains("Q") || line.contains("9")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}