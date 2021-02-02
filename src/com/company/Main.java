package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        //TreeSet<Integer> treeSet = new TreeSet<>();
        //LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();


        int num = 101;
        int[] array = new int[num];

        for (int i = 1; i < num;i++){
            array[i] = i;
            System.out.println(array[i]);
        if (array[i] % 5 == 0) {
            hashSet.add(array[i]);
        }else if (array[i] % 2 == 0){
            hashSet.add(array[i]);

        }
        }

        System.out.println(hashSet);

        // На счет вопроса я думаю что нельзя так как HashSet хранит данные в сложном алгоритме и это не позволяет нам задавать
        // свой алгоритм также я не смог сделать это в TreeSet и в LinkedHashSet и нам следует использовать другие варианты
        // например листы или массивы



    }
}
