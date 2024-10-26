package ru.geekbrains.lesson1.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /*Напишите программу, которая использует Stream API для обработки списка чисел.
         Программа должна вывести на экран среднее значение всех четных чисел в списке.*/

        List<Integer> list = Arrays.asList(1,51,10,6,33,5,41,41,11,11,9,3,3);
        double average =list.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).average().orElse(0);

        System.out.println(average);

    }
}
