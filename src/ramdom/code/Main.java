/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramdom.code;

import java.util.Arrays;

/**
 *
 * @author fjcorona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // TODO code application logic here
        String word1 = "Roma";
        String word2 = "Amor";
        if(Anagram.compare(word1, word2)) {
            System.out.println("\"" + word1 + "\" y \"" + word2 + "\" son anagramas");
        } else {
            System.out.println("\"" + word1 + "\" y \"" + word2 + "\" no son anagramas");
        }
        */
        // Array de String
        /*
        String[] names = {"Pepe", "Juan", "Alex", "Julian", "Francisco", "Luis"};
        System.out.println(Arrays.toString(names));
        names = WordSorter.mySort(names, false);
        System.out.println("Ascendente: " + Arrays.toString(names));
        names = WordSorter.mySort(names, true);
        System.out.println("Descendente: " + Arrays.toString(names));
        */
        
        /*
        int[] numbers = {4, 5, 1, 8, 6, 7, 2, 3};
        System.out.println(Arrays.toString(numbers));
        WordSorter.bubbleSort(numbers, true);
        System.out.println(Arrays.toString(numbers));
        WordSorter.bubbleSort(numbers, false);
        System.out.println(Arrays.toString(numbers));
        */
        String[] names = {"Julio", "Pepe", "Julian", "Alex", "Juan", "Francisco", "Luis"};
        System.out.println(Arrays.toString(names));
        WordSorter.bubbleSort(names, true);
        System.out.println(Arrays.toString(names));
        /*
        WordSorter.bubbleSort(names, false);
        System.out.println(Arrays.toString(names));
        */
    }
    
}
