package de.telran.hw_17_25sept_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainHw17 {

    public static void main(String[] args) {
        //1) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("a1", "b5", "a2", "b4"));

        List<String> result = arrayList1.stream()
                .sorted()
                .limit(1)
                .toList();

        System.out.println("самый маленький элемент:  " + result);
        System.out.println();

// 2) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
// Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1"));

        List<String> listResult = arrayList2.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println("отсортированный В ОБРАТНОМ алф порядке список без дубликатов:  ");
        System.out.println(listResult);
        System.out.println();

//3)* Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
//    Сколько раз объект «Big» встречается в коллекции?
        ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob"));
        long countBig = arrayList3.stream()
                .filter(x -> x.equals("Big"))
                .count();

        System.out.println("«Big» встречается в коллекции:  " + countBig + "  раз.");


    }
}
