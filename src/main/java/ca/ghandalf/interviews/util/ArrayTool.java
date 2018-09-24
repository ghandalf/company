package ca.ghandalf.interviews.util;

import java.util.Arrays;

/**
 *
 * @author ghandalf
 */
public class ArrayTool {

    // No intanciation
    private ArrayTool() {
    }

    public static <T> T[] concat(T[] first, T[] ... arrays) {
        int resultSize = first.length;
        for (T[] array : arrays) {
            resultSize += array.length;
        }

        T[] result = Arrays.copyOfRange(first, 0, resultSize);

        int insertIndex = first.length;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, insertIndex, array.length);
            insertIndex += array.length;
        }

        return result;
    }
}
