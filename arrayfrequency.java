import java.util.*;

public class arrayfrequency{
    public static void main(String[] args){
          int[] array = {1, 2, 2, 3, 1, 4, 2, 3, 5};

        // Use HashMap to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        frequencyMap.forEach((key, value) -> 
            System.out.println("Element: " + key + ", Frequency: " + value));
    }
}