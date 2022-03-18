package ua.com.unicatstudio.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class P0013_RomanToInteger {
    // https://leetcode.com/problems/roman-to-integer/
    public LinkedHashMap<String, Integer> getAlphabet() {
        LinkedHashMap<String, Integer> alphabet = new LinkedHashMap<>();
        alphabet.put("IV", 4);
        alphabet.put("IX", 9);
        alphabet.put("XL", 40);
        alphabet.put("XC", 90);
        alphabet.put("CD", 400);
        alphabet.put("CM", 900);
        alphabet.put("I", 1);
        alphabet.put("V", 5);
        alphabet.put("X", 10);
        alphabet.put("L", 50);
        alphabet.put("C", 100);
        alphabet.put("D", 500);
        alphabet.put("M", 1000);

        return alphabet;
    }

    public int romanToInt(String s) {
        LinkedHashMap<String, Integer> alphabet = getAlphabet();
        int result = 0;

        for (Map.Entry<String, Integer> entry : alphabet.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            while (s.contains(key)) {
                result += value;
                s = s.replaceFirst(key, "");
            }
            if (s.isEmpty()) break;
        }

        return result;
    }

    // Так как я сразу не пошел по пути прямого чтения строки, то решение получилось
    // ужасно медленным. Но прямое чтение строки это не очень интересно. Зато познакомился
    // с LinkedHashMap. Для учебного проекта этот считаю результат лучше, чем знакомый перебор.

}
