package org.example;

public class Test1 extends Test {
    @Override
    void countVowel() {

        String s = "Maia Khalvashi";

        String vowels = "aeiouAEIOU";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println("ამ სტრიქონში არის " + count + " ხმოვანი");

    }
}
