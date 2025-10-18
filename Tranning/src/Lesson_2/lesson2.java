/**
 * Урок 2. Вывод в консоль: System.out.println и System.out.print
 * ------------------
 * System.out.println() - позволяет нам выводить информацию в консоль и в конце добавляет красную строку
 * System.out.print() - позволяет нам выводить информацию в консоль и в конце не добавляет красную строку
 * ------------------
 * */

package Lesson_2;

public class lesson2 {

    static void main(String[] args) {

        // Вывод с кросной строкой
        System.out.println("Hello");
        System.out.println("world!");
        /** Результат:
         * >> Hello
         * >> world!
         */

        // Вывод без красной строки
        System.out.print("Hello");
        System.out.print("world!");
        /** Результат:
         * >> Helloworld!
         */
    }
}
