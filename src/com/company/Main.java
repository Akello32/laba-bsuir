package com.company;

import java.util.Scanner;

/*Дан код на следующих языках программировани (средах): JavaScript (ES2015), Java, Python. Необходимо проделать ревью этого кода и найти все функциональные ошибки, синтаксические ошибки, а также предложить улучшения, если это необходимо.

Тайминг: 30 минут

Разработчику было предоставлено следующее ТЗ.

Необходимо реализовать функцию на следующих языках программирования: JavaScript, Python, Java.
Функция должна принимать на вход целочисленное значение X, а также размерность матрицы.
Задача функции - генерация 3-мерной матрицы заданного размера,
притом что элементы матрицы определены объектами, состоящие из параметров А, В и С.
Правила расчета каждого параметра:
A - куб случайного числа от 1 до X,
B - квадрат случайного числа от 1 до X минус само случайное число,
С - случайное число от 1 до X умноженное на 10.
Случайное число генерируется для каждого параметра в отдельности.

Сделайте ревью кода, предоставленного разработчиком, на одном из языков программирования (на ваш выбор) и определите все функциональные ошибки, синтаксические ошибки и неточности языка программирования, а также (если это необходимо) предложите улучшения в коде.

*/
public class Main {

    public static void main(String[] args) {
        generateMatrix();
    }

    public static Matrix3d generateMatrix() {
        MatrixService matrixService = new MatrixService();

        System.out.println("Enter X number");
        int X = Integer.parseInt(checkNumber());

        System.out.println("Enter the height of the matrix");
        int height = Integer.parseInt(checkNumber());

        System.out.println("Enter row number");
        int row = Integer.parseInt(checkNumber());

        System.out.println("Enter col number");
        int col = Integer.parseInt(checkNumber());

        Matrix3d matrix3d = new Matrix3d(row, col, height);

        matrixService.fillMatrix(matrix3d, X);

        matrixService.showMatrix(matrix3d);

        return matrix3d;
    }

    private static String checkNumber() {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();

        while (!temp.matches("[-+]?\\d+")) {
            System.out.println("Enter number!!!");
            temp = sc.nextLine();

        }

        return temp;
    }
}
