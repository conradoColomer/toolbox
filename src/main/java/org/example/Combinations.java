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

        // Genera todas las combinaciones de 2 elementos
        Set<Set<String>> combinations = Sets.combinations(str, 3);

        for (Set<String> combo : combinations) {
            System.out.println("The combinations are:\n" + combo);
        }




    }
}