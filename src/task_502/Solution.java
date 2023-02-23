import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        if (k >= profits.length && w >= Arrays.stream(capital).max().getAsInt()) {
            return w + Arrays.stream(profits).sum();
        }
        if (w < Arrays.stream(capital).min().getAsInt()) {
            return w;
        }
        Map<Integer, List<Integer>> profitsCapitals = new TreeMap<>();
        int finishedProjectsNumber = 0;
        for (int i = 0; i < profits.length; i++) {
            if (!profitsCapitals.containsKey(profits[i])) {
                profitsCapitals.put(profits[i], new ArrayList<>());
            }
            profitsCapitals.get(profits[i]).add(capital[i]);
        }
        List<Integer> keys = new ArrayList<>(profitsCapitals.keySet());
        for (int i = keys.size() - 1; i >= 0; i--) {
            if (finishedProjectsNumber == k) {
                break;
            }
            if (profitsCapitals.get(keys.get(i)).size() == 0) {
                continue;
            }
            int min = profitsCapitals.get(keys.get(i)).stream().mapToInt(v -> v).min().getAsInt();
            if (min <= w) {
                int idx = profitsCapitals.get(keys.get(i)).indexOf(min);
                w += keys.get(i);
                profitsCapitals.get(keys.get(i)).remove(idx);
                i = keys.size();
                finishedProjectsNumber++;
            }
            if (i == 0) {
                break;
            }
        }
        return w;
    }

}