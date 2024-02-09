import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineArrays {
    public static void main(String[] args) {
        // Example usage
        Integer[] array1 = {11, 22, 33, 45};
        Integer[] array2 = {1, 2, 3};

        Integer[] result = combine(array1, array2);

        System.out.println(Arrays.toString(result));
    }

    public static Integer[] combine(Integer[] array1, Integer[] array2) {
        List<Integer> combinedList = new ArrayList<>();

        int maxLength = Math.max(array1.length, array2.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < array1.length) {
                combinedList.add(array1[i]);
            }

            if (i < array2.length) {
                combinedList.add(array2[i]);
            }
        }

        return combinedList.toArray(new Integer[0]);
    }
}
