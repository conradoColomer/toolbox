package org.example;

import com.google.common.collect.Sets;

import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Combinations {
    public static void main(String[] args) {

// this combinations algorithm creates the possible agrupations. It does not
//        take into account the position of each element


        Set<String> str =  Set.of("Admin", "Super", "Employee");
//        System.out.println(str);

        combinations(str,
                 2);
        combinations(str,
                3);
        combinations(str,
                1);




    }

    public static void combinations (Set<String> array , int size_of_agrupation) {
        // Genera todas las combinaciones de 2 elementos
        Set<Set<String>> combinations = Sets.combinations(array, size_of_agrupation);
        int counter = 0;

        for (Set<String> comb : combinations) {
            counter++;
            System.out.println("The combinations of " + size_of_agrupation + " are on the "
                    + counter+  " place:\n" + comb + "\n");
//            System.out.println();
        }

    }
}