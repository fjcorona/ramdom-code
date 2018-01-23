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
public class WordSorter {

    // INT: ARRAY
    
    private static void swapElement(int[] myArray, int index1, int index2) {
        int temp = myArray[index1];
        myArray[index1] = myArray[index2];
        myArray[index2] = temp;
    }
    
    private static void bubbleSortAsc(int[] myArray) {
        for (int idx = myArray.length - 1; idx > 0; idx--) {
            for (int jdx = myArray.length - 1; jdx > 0; jdx--) {
                int index1 = jdx - 1;
                int index2 = jdx;
                if (myArray[index1] > myArray[index2]) {
                    swapElement(myArray, index1, index2);
                }
            }
        }
    }

    private static void bubbleSortDesc(int[] myArray) {
        for (int idx = 0; idx < myArray.length - 1; idx++) {
            for (int jdx = 0; jdx < myArray.length - 1; jdx++) {
                int index1 = jdx;
                int index2 = jdx + 1;
                if (myArray[index1] < myArray[index2]) {
                    swapElement(myArray, index2, index1);
                }
            }
        }
    }

    public static void bubbleSort(int[] myArray, Boolean reverse) {
        if (!reverse) {
            bubbleSortAsc(myArray);
        } else {
            bubbleSortDesc(myArray);
        }
    }

    // STRING: Array
    private static int[] getCharsCompare(String word1, String word2) {
        int[] charsCompare = new int[2];
        
        int length1 = word1.length();
        int length2 = word2.length();

        int nLaps = (length1 < length2) ? length1: length2;

        charsCompare[0] =  word1.toLowerCase().charAt(0);
        charsCompare[1] =  word2.toLowerCase().charAt(0);

        for (int lap = 1; lap < nLaps && charsCompare[0] == charsCompare[1]; lap++) {
            charsCompare[0] = word1.toLowerCase().charAt(lap);
            charsCompare[1] = word2.toLowerCase().charAt(lap);
        }
        
        return charsCompare;
    }
    private static void swapElement(String[] myArray, int index1, int index2) {
        String temp = myArray[index1];
        myArray[index1] = myArray[index2];
        myArray[index2] = temp;
    }
    
    public static void bubbleSortAsc(String[] myArray) {
        // Ciclo para recorrer cada uno de las palabras del arreglo
        for (int idx = myArray.length - 1; idx > 0; idx--) {
            // Ciclo para compararlo con cada uno de los demás elementos
            for (int jdx = myArray.length - 1; jdx > 0; jdx--) {
                
                // Obtener índices
                int index1 = jdx - 1;
                int index2 = jdx;
                
                // Obtener palabras a comparar
                String word1 = myArray[index1];
                String word2 = myArray[index2];
                
                // Obtener el caracter de cada palabra que nos dirá cual es alfabéticamente menor
                // En caso de que las palabras coincidan en más de un caracter inicial
                int[] charsCompare = getCharsCompare(word1, word2);
                
                // Si la palbra de la izquierda es alfabéticamente mayor a la de la derecha
                if (charsCompare[0] > charsCompare[1]) {
                    // Intercambiar elementos
                    swapElement(myArray, index1, index2);
                }
            }
        }
    }
    
    public static void bubbleSortDesc(String[] myArray) {        
        // Ciclo para recorrer cada uno de las palabras del arreglo
        for (int idx = 0; idx < myArray.length - 1; idx++) {
            // Ciclo para compararlo con cada uno de los demás elementos
            for (int jdx = 0; jdx < myArray.length - 1; jdx++) {
                
                // Obtener índices
                int index1 = jdx;
                int index2 = jdx + 1;
                
                // Obtener palabras a comparar
                String word1 = myArray[index1];
                String word2 = myArray[index2];
                
                // Obtener el caracter de cada palabra que nos dirá cual es alfabéticamente menor
                // En caso de que las palabras coincidan en más de un caracter inicial
                int[] charsCompare = getCharsCompare(word1, word2);
                
                // Si la palbra de la izquierda es alfabéticamente menor a la de la derecha
                if (charsCompare[0] < charsCompare[1]) {
                    // Intercambiar elementos
                    swapElement(myArray, index2, index1);
                }
            }
        }
        
    }
    
    public static void bubbleSort(String[] myArray, Boolean reverse) {
        if (!reverse) {
            bubbleSortAsc(myArray);
        } else {
            bubbleSortDesc(myArray);
        }
    }
    
    public static String[] collectionsSort(String[] myArray, Boolean reverse) {
        Arrays.sort(myArray);
        String[] reversed = new String[myArray.length];

        for (int idx = myArray.length - 1, jdx = 0; reverse && idx >= 0; idx--, jdx++) {
            reversed[jdx] = myArray[idx];
        }

        return (reverse) ? reversed : myArray;
    }

}
