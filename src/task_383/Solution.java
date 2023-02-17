package task_383;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (dictionary.containsKey(magazine.charAt(i))) {
                dictionary.put(magazine.charAt(i), dictionary.get(magazine.charAt(i)) + 1);
            } else {
                dictionary.put(magazine.charAt(i), 1);
            }
        }
        List<Boolean> canConstruct = new ArrayList<>(ransomNote.length());
        for (int i = 0; i < ransomNote.length(); i++) {
            if (dictionary.containsKey(ransomNote.charAt(i))) {
                if (dictionary.get(ransomNote.charAt(i)) >= 1) {
                    canConstruct.add(i, true);
                    dictionary.put(ransomNote.charAt(i), dictionary.get(ransomNote.charAt(i)) - 1);
                } else {
                    canConstruct.add(i, false);
                }
            } else {
                canConstruct.add(i, false);
            }
        }
        return !canConstruct.contains(false);
    }

}
