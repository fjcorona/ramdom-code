/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramdom.code;

/**
 *
 * @author fjcorona
 */
public class Anagram {
    static boolean compare(String word1, String word2) {
        
        if(word1.length() != word2.length()) {
            // System.out.println("Distintas longitudes, no puede ser anagrama");
            return false;
        }
        
        String word1Test = word1.toLowerCase();
        String word2Test = word2.toLowerCase();
        
        for(int idx = 0; idx < word1.length(); idx++) {
            char letter = word1.charAt(idx);
            System.out.println(letter + "\n");
            word1Test = word1Test.replace(letter, '\0').trim();
            word2Test = word2Test.replace(letter, '\0').trim();
            System.out.println("Word 1: \"" + word1Test +"\"");
            System.out.println("Word 2: \"" + word2Test +"\"");
        }
        
        System.out.println("FINAL: \"" + word1Test + "\", \"" + word2Test + "\"");
        
        return (word1Test.length() == 0 && word2Test.length() == 0);
    }
}
